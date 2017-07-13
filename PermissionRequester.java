package com.example.baker.permissiontest;

import android.app.Activity;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.PermissionChecker;
import android.content.Context;
import static android.content.pm.PackageManager.*;
import static com.example.baker.permissiontest.PermissionConstantsWrapper.*;


/**
 * Created by Baker on 2017/07/11.
 */

/**
 * パーミッションのリクエストを取り扱うクラス。
 * 自作の PermissionConstantsWrapper クラスに依存している。
 */
public class PermissionRequester {


    /**
     * パーミッションの許可を求めるダイアログを表示する。
     * Marshmallow 以前のOSであるか、すでに許可されている場合はリクエストしない。
     * @param activity
     * @param permission
     */
    public static void request(Activity activity, Permission permission){
        // Marshmallow より昔のバージョンならインストール時にすでに許可されている?
        if (isMarshmallowOrLater() == false){ return; }

        // すでに許可されているかどうか調べに行く。
        Context context = activity.getApplicationContext();
        boolean permitted = isPermitted(context, permission);

        // すでに許可されている場合。
        if (permitted){ return; }

        // Marshmallow 以降のバージョン && 許可されていない場合、許可を求める。。
        String[] permissionValue = new String[]{permission.permissionName};
        ActivityCompat.requestPermissions(activity, permissionValue, 1);        // 最後の int はonRequestPermissionResult で使うようだが、利用しないならどんな値でもいいのかも
    }



    /**
     * ビルドのバージョン(Build.VERSION.SDK_INT) が Marshmallow 以後のバージョンか調べる。
     * @return
     */
    private static boolean isMarshmallowOrLater(){
        int detectedVersion = Build.VERSION.SDK_INT;
        int marshmallowVersion = Build.VERSION_CODES.M;

        if (detectedVersion < marshmallowVersion){return false;}

        return  true;
    }


    /**
     * パーミッションが許可されているかどうか調べる。
     * 自作の PermissionConstantsWrapper クラスに依存している。
     * @param context
     * @param permission
     * @return
     */
    public static boolean isPermitted(Context context, Permission permission){
        int result =
                PermissionChecker.checkSelfPermission(context, permission.permissionName);

        if (result == PERMISSION_GRANTED){
            return true;
        }

        return false;
    }
}
