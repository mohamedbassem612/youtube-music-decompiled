package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aamq {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/model/OfflineVideoList");
    public final String b;
    public final int c;
    public final int d;

    public aamq(String str, int i, int i2) {
        str.getClass();
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public static String a(int i) {
        try {
            StringBuilder sb = new StringBuilder("auto_offline_video_list_");
            sb.append(i - 1);
            return sb.toString();
        } catch (NullPointerException unused) {
            return "auto_offline_video_list_0";
        }
    }

    public aamq(aamq aamqVar, int i) {
        this(aamqVar.b, i, aamqVar.d);
    }
}
