package defpackage;

import android.os.Build;
import android.os.flagging.AconfigPackage;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static volatile boolean a = false;
    public static boolean b = false;

    public static final void a() {
        if (Build.VERSION.SDK_INT > 35) {
            try {
                AconfigPackage aconfigPackageLoad = AconfigPackage.load("android.companion.virtualdevice.flags");
                aconfigPackageLoad.getBooleanFlagValue("activity_control_api", false);
                aconfigPackageLoad.getBooleanFlagValue("activity_launch_requested_api", false);
                aconfigPackageLoad.getBooleanFlagValue("associated_display_id_input_api", false);
                aconfigPackageLoad.getBooleanFlagValue("default_device_camera_access_policy", false);
                aconfigPackageLoad.getBooleanFlagValue("device_aware_display_power", false);
                aconfigPackageLoad.getBooleanFlagValue("device_aware_thermal_status", false);
                aconfigPackageLoad.getBooleanFlagValue("device_aware_touch_mode", false);
                aconfigPackageLoad.getBooleanFlagValue("device_aware_ui_mode", false);
                aconfigPackageLoad.getBooleanFlagValue("enable_limited_vdm_role", false);
                b = aconfigPackageLoad.getBooleanFlagValue("public_device_profile", false);
                aconfigPackageLoad.getBooleanFlagValue("status_bar_and_insets", false);
                aconfigPackageLoad.getBooleanFlagValue("support_single_app_mirroring", false);
                aconfigPackageLoad.getBooleanFlagValue("task_management_apis", false);
                aconfigPackageLoad.getBooleanFlagValue("vdm_mirror_display_permission", false);
                aconfigPackageLoad.getBooleanFlagValue("viewconfiguration_apis", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_camera_close_session", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_camera_metadata", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_camera_notify_error", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_camera_on_open", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_camera_support_api", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_display_insets", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_display_rotation_api", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_input_view_behavior", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_rotary", false);
                aconfigPackageLoad.getBooleanFlagValue("virtual_sensor_additional_info", false);
            } catch (Exception e) {
                Log.e("ExportedFlags", e.toString());
            } catch (LinkageError e2) {
                Log.w("ExportedFlags", e2.toString());
            }
            a = true;
        }
    }
}
