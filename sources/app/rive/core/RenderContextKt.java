package app.rive.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderContextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean supportsVulkanDebugNames(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -938287055) {
            if (iHashCode != -145892544) {
                if (iHashCode == 2036942520 && str.equals("goldfish")) {
                    return false;
                }
            } else if (str.equals("gce_x86")) {
                return false;
            }
        } else if (str.equals("ranchu")) {
            return false;
        }
        return true;
    }
}
