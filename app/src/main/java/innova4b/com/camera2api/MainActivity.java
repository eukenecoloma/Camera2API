package innova4b.com.camera2api;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Size;
import android.view.TextureView;
import android.view.View;

import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    private CameraDevice mCameraDevice;
    private CaptureRequest.Builder mCaptureRequestBuilder;
    private CameraCaptureSession mCameraCaptureSession;
    private TextureView mTextureView;
    private Size mPreviewSize;

    static class CompareSizesByArea implements Comparator<Size>{

        @Override
        public int compare(Size lhs, Size rhs) {

//            long areaLeft = lhs.getWidth() * lhs.getHeight();
//            long areaRight = rhs.getWidth() * rhs.getHeight();
//
//            if (areaLeft == areaRight) {
//                return 0;
//            } else if (areaLeft < areaRight){
//                return -1;
//            } else {
//                return 1;
//            }

            return (lhs.getWidth() * lhs.getHeight()) - (rhs.getWidth() * rhs.getHeight());
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void takePicture(View view) {
    }
}
