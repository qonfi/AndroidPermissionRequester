package com.example.baker.permissiontest;

/**
 * Created by Baker on 2017/07/13.
 */



/**
 * android.Manifest.permission にある大量の定数を enum に置き換えただけのクラス。
 * 定数クラスがどうも使いづらく、enum のほうがいいのでは? ということで作成。
 * でもラッパークラスではないかも?
 * ちなみに Deprecated っぽい定数は enum に置き換えなかった。
 */
public final class PermissionConstantsWrapper {

    /**
     * パーミッションの種類を表す。
     * それぞれの値が permissionName という文字列を持っており、これが android.Manifest.permission から
     * 定数を参照して得る文字列と同一のものとなっている。
     */
    public static enum Permission {
        ACCESS_CHECKIN_PROPERTIES("android.permission.ACCESS_CHECKIN_PROPERTIES"),
        ACCESS_COARSE_LOCATION("android.permission.ACCESS_COARSE_LOCATION"),
        ACCESS_FINE_LOCATION("android.permission.ACCESS_FINE_LOCATION"),
        ACCESS_LOCATION_EXTRA_COMMANDS("android.permission.ACCESS_LOCATION_EXTRA_COMMANDS"),
        ACCESS_NETWORK_STATE("android.permission.ACCESS_NETWORK_STATE"),
        ACCESS_NOTIFICATION_POLICY("android.permission.ACCESS_NOTIFICATION_POLICY"),
        ACCESS_WIFI_STATE("android.permission.ACCESS_WIFI_STATE"),
        ACCOUNT_MANAGER("android.permission.ACCOUNT_MANAGER"),
        ADD_VOICEMAIL("com.android.voicemail.permission.ADD_VOICEMAIL"),
        BATTERY_STATS("android.permission.BATTERY_STATS"),
        BIND_ACCESSIBILITY_SERVICE("android.permission.BIND_ACCESSIBILITY_SERVICE"),
        BIND_APPWIDGET("android.permission.BIND_APPWIDGET"),

        BIND_CARRIER_SERVICES("android.permission.BIND_CARRIER_SERVICES"),
        BIND_CHOOSER_TARGET_SERVICE("android.permission.BIND_CHOOSER_TARGET_SERVICE"),
        BIND_CONDITION_PROVIDER_SERVICE("android.permission.BIND_CONDITION_PROVIDER_SERVICE"),
        BIND_DEVICE_ADMIN("android.permission.BIND_DEVICE_ADMIN"),
        BIND_DREAM_SERVICE("android.permission.BIND_DREAM_SERVICE"),
        BIND_INCALL_SERVICE("android.permission.BIND_INCALL_SERVICE"),
        BIND_INPUT_METHOD("android.permission.BIND_INPUT_METHOD"),
        BIND_MIDI_DEVICE_SERVICE("android.permission.BIND_MIDI_DEVICE_SERVICE"),
        BIND_NFC_SERVICE("android.permission.BIND_NFC_SERVICE"),
        BIND_NOTIFICATION_LISTENER_SERVICE("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"),
        BIND_PRINT_SERVICE("android.permission.BIND_PRINT_SERVICE"),
        BIND_QUICK_SETTINGS_TILE("android.permission.BIND_QUICK_SETTINGS_TILE"),
        BIND_REMOTEVIEWS("android.permission.BIND_REMOTEVIEWS"),
        BIND_SCREENING_SERVICE("android.permission.BIND_SCREENING_SERVICE"),
        BIND_TELECOM_CONNECTION_SERVICE("android.permission.BIND_TELECOM_CONNECTION_SERVICE"),
        BIND_TEXT_SERVICE("android.permission.BIND_TEXT_SERVICE"),
        BIND_TV_INPUT("android.permission.BIND_TV_INPUT"),
        BIND_VOICE_INTERACTION("android.permission.BIND_VOICE_INTERACTION"),
        BIND_VPN_SERVICE("android.permission.BIND_VPN_SERVICE"),
        BIND_VR_LISTENER_SERVICE("android.permission.BIND_VR_LISTENER_SERVICE"),
        BIND_WALLPAPER("android.permission.BIND_WALLPAPER"),
        BLUETOOTH("android.permission.BLUETOOTH"),
        BLUETOOTH_ADMIN("android.permission.BLUETOOTH_ADMIN"),
        BLUETOOTH_PRIVILEGED("android.permission.BLUETOOTH_PRIVILEGED"),
        BODY_SENSORS("android.permission.BODY_SENSORS"),
        BROADCAST_PACKAGE_REMOVED("android.permission.BROADCAST_PACKAGE_REMOVED"),
        BROADCAST_SMS("android.permission.BROADCAST_SMS"),
        BROADCAST_STICKY("android.permission.BROADCAST_STICKY"),
        BROADCAST_WAP_PUSH("android.permission.BROADCAST_WAP_PUSH"),
        CALL_PHONE("android.permission.CALL_PHONE"),
        CALL_PRIVILEGED("android.permission.CALL_PRIVILEGED"),
        CAMERA("android.permission.CAMERA"),
        CAPTURE_AUDIO_OUTPUT("android.permission.CAPTURE_AUDIO_OUTPUT"),
        CAPTURE_SECURE_VIDEO_OUTPUT("android.permission.CAPTURE_SECURE_VIDEO_OUTPUT"),
        CAPTURE_VIDEO_OUTPUT("android.permission.CAPTURE_VIDEO_OUTPUT"),
        CHANGE_COMPONENT_ENABLED_STATE("android.permission.CHANGE_COMPONENT_ENABLED_STATE"),
        CHANGE_CONFIGURATION("android.permission.CHANGE_CONFIGURATION"),
        CHANGE_NETWORK_STATE("android.permission.CHANGE_NETWORK_STATE"),
        CHANGE_WIFI_MULTICAST_STATE("android.permission.CHANGE_WIFI_MULTICAST_STATE"),
        CHANGE_WIFI_STATE("android.permission.CHANGE_WIFI_STATE"),
        CLEAR_APP_CACHE("android.permission.CLEAR_APP_CACHE"),
        CONTROL_LOCATION_UPDATES("android.permission.CONTROL_LOCATION_UPDATES"),
        DELETE_CACHE_FILES("android.permission.DELETE_CACHE_FILES"),
        DELETE_PACKAGES("android.permission.DELETE_PACKAGES"),
        DIAGNOSTIC("android.permission.DIAGNOSTIC"),
        DISABLE_KEYGUARD("android.permission.DISABLE_KEYGUARD"),
        DUMP("android.permission.DUMP"),
        EXPAND_STATUS_BAR("android.permission.EXPAND_STATUS_BAR"),
        FACTORY_TEST("android.permission.FACTORY_TEST"),
        GET_ACCOUNTS("android.permission.GET_ACCOUNTS"),
        GET_ACCOUNTS_PRIVILEGED("android.permission.GET_ACCOUNTS_PRIVILEGED"),
        GET_PACKAGE_SIZE("android.permission.GET_PACKAGE_SIZE"),

        GLOBAL_SEARCH("android.permission.GLOBAL_SEARCH"),
        INSTALL_LOCATION_PROVIDER("android.permission.INSTALL_LOCATION_PROVIDER"),
        INSTALL_PACKAGES("android.permission.INSTALL_PACKAGES"),
        INSTALL_SHORTCUT("com.android.launcher.permission.INSTALL_SHORTCUT"),
        INTERNET("android.permission.INTERNET"),
        KILL_BACKGROUND_PROCESSES("android.permission.KILL_BACKGROUND_PROCESSES"),
        LOCATION_HARDWARE("android.permission.LOCATION_HARDWARE"),
        MANAGE_DOCUMENTS("android.permission.MANAGE_DOCUMENTS"),
        MASTER_CLEAR("android.permission.MASTER_CLEAR"),
        MEDIA_CONTENT_CONTROL("android.permission.MEDIA_CONTENT_CONTROL"),
        MODIFY_AUDIO_SETTINGS("android.permission.MODIFY_AUDIO_SETTINGS"),
        MODIFY_PHONE_STATE("android.permission.MODIFY_PHONE_STATE"),
        MOUNT_FORMAT_FILESYSTEMS("android.permission.MOUNT_FORMAT_FILESYSTEMS"),
        MOUNT_UNMOUNT_FILESYSTEMS("android.permission.MOUNT_UNMOUNT_FILESYSTEMS"),
        NFC("android.permission.NFC"),
        PACKAGE_USAGE_STATS("android.permission.PACKAGE_USAGE_STATS"),

        PROCESS_OUTGOING_CALLS("android.permission.PROCESS_OUTGOING_CALLS"),
        READ_CALENDAR("android.permission.READ_CALENDAR"),
        READ_CALL_LOG("android.permission.READ_CALL_LOG"),
        READ_CONTACTS("android.permission.READ_CONTACTS"),
        READ_EXTERNAL_STORAGE("android.permission.READ_EXTERNAL_STORAGE"),
        READ_FRAME_BUFFER("android.permission.READ_FRAME_BUFFER"),

        READ_LOGS("android.permission.READ_LOGS"),
        READ_PHONE_STATE("android.permission.READ_PHONE_STATE"),
        READ_SMS("android.permission.READ_SMS"),
        READ_SYNC_SETTINGS("android.permission.READ_SYNC_SETTINGS"),
        READ_SYNC_STATS("android.permission.READ_SYNC_STATS"),
        READ_VOICEMAIL("com.android.voicemail.permission.READ_VOICEMAIL"),
        REBOOT("android.permission.REBOOT"),
        RECEIVE_BOOT_COMPLETED("android.permission.RECEIVE_BOOT_COMPLETED"),
        RECEIVE_MMS("android.permission.RECEIVE_MMS"),
        RECEIVE_SMS("android.permission.RECEIVE_SMS"),
        RECEIVE_WAP_PUSH("android.permission.RECEIVE_WAP_PUSH"),
        RECORD_AUDIO("android.permission.RECORD_AUDIO"),
        REORDER_TASKS("android.permission.REORDER_TASKS"),
        REQUEST_IGNORE_BATTERY_OPTIMIZATIONS("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"),
        REQUEST_INSTALL_PACKAGES("android.permission.REQUEST_INSTALL_PACKAGES"),

        SEND_RESPOND_VIA_MESSAGE("android.permission.SEND_RESPOND_VIA_MESSAGE"),
        SEND_SMS("android.permission.SEND_SMS"),
        SET_ALARM("com.android.alarm.permission.SET_ALARM"),
        SET_ALWAYS_FINISH("android.permission.SET_ALWAYS_FINISH"),
        SET_ANIMATION_SCALE("android.permission.SET_ANIMATION_SCALE"),
        SET_DEBUG_APP("android.permission.SET_DEBUG_APP"),

        SET_PROCESS_LIMIT("android.permission.SET_PROCESS_LIMIT"),
        SET_TIME("android.permission.SET_TIME"),
        SET_TIME_ZONE("android.permission.SET_TIME_ZONE"),
        SET_WALLPAPER("android.permission.SET_WALLPAPER"),
        SET_WALLPAPER_HINTS("android.permission.SET_WALLPAPER_HINTS"),
        SIGNAL_PERSISTENT_PROCESSES("android.permission.SIGNAL_PERSISTENT_PROCESSES"),
        STATUS_BAR("android.permission.STATUS_BAR"),
        SYSTEM_ALERT_WINDOW("android.permission.SYSTEM_ALERT_WINDOW"),
        TRANSMIT_IR("android.permission.TRANSMIT_IR"),
        UNINSTALL_SHORTCUT("com.android.launcher.permission.UNINSTALL_SHORTCUT"),
        UPDATE_DEVICE_STATS("android.permission.UPDATE_DEVICE_STATS"),
        USE_FINGERPRINT("android.permission.USE_FINGERPRINT"),
        USE_SIP("android.permission.USE_SIP"),
        VIBRATE("android.permission.VIBRATE"),
        WAKE_LOCK("android.permission.WAKE_LOCK"),
        WRITE_APN_SETTINGS("android.permission.WRITE_APN_SETTINGS"),
        WRITE_CALENDAR("android.permission.WRITE_CALENDAR"),
        WRITE_CALL_LOG("android.permission.WRITE_CALL_LOG"),
        WRITE_CONTACTS("android.permission.WRITE_CONTACTS"),
        WRITE_EXTERNAL_STORAGE("android.permission.WRITE_EXTERNAL_STORAGE"),
        WRITE_GSERVICES("android.permission.WRITE_GSERVICES"),
        WRITE_SECURE_SETTINGS("android.permission.WRITE_SECURE_SETTINGS"),
        WRITE_SETTINGS("android.permission.WRITE_SETTINGS"),
        WRITE_SYNC_SETTINGS("android.permission.WRITE_SYNC_SETTINGS"),
        WRITE_VOICEMAIL("com.android.voicemail.permission.WRITE_VOICEMAIL"),
        ;

        public final String permissionName;

        private Permission(String permissionName) {
            this.permissionName = permissionName;
        }
    }
}
