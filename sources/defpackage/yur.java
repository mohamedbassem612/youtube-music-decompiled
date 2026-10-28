package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LivePlayerConfigOuterClass$LivePlayerConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yur implements bzg {
    final /* synthetic */ yup a;
    private final Set b = new HashSet();

    public yur(yup yupVar) {
        this.a = yupVar;
    }

    @Override // defpackage.bzg
    public final void a(bye byeVar, byi byiVar, boolean z, int i) {
        yup yupVar = this.a;
        synchronized (yupVar) {
            if (!this.b.contains(byeVar)) {
                yupVar.m(i);
            }
        }
    }

    @Override // defpackage.bzg
    public final void b(bye byeVar, byi byiVar, boolean z) {
        yup yupVar = this.a;
        synchronized (yupVar) {
            if (!this.b.remove(byeVar)) {
                yupVar.n();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041 A[Catch: all -> 0x00ba, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000d, B:7:0x0010, B:9:0x0012, B:11:0x0018, B:13:0x001a, B:15:0x001f, B:17:0x0027, B:18:0x002b, B:20:0x0031, B:22:0x0039, B:23:0x003d, B:46:0x0086, B:48:0x0094, B:50:0x0098, B:51:0x009a, B:56:0x00a4, B:57:0x00af, B:25:0x0041, B:27:0x004c, B:28:0x004e, B:29:0x0050, B:31:0x0057, B:33:0x005d, B:35:0x0065, B:37:0x006b, B:39:0x0074, B:59:0x00b1, B:60:0x00b6), top: B:69:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004c A[Catch: all -> 0x00ba, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000d, B:7:0x0010, B:9:0x0012, B:11:0x0018, B:13:0x001a, B:15:0x001f, B:17:0x0027, B:18:0x002b, B:20:0x0031, B:22:0x0039, B:23:0x003d, B:46:0x0086, B:48:0x0094, B:50:0x0098, B:51:0x009a, B:56:0x00a4, B:57:0x00af, B:25:0x0041, B:27:0x004c, B:28:0x004e, B:29:0x0050, B:31:0x0057, B:33:0x005d, B:35:0x0065, B:37:0x006b, B:39:0x0074, B:59:0x00b1, B:60:0x00b6), top: B:69:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0074 A[Catch: IllegalArgumentException -> 0x0081, all -> 0x00ba, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0081, blocks: (B:29:0x0050, B:31:0x0057, B:33:0x005d, B:35:0x0065, B:37:0x006b, B:39:0x0074), top: B:67:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    @Override // defpackage.bzg
    public final void d(bye byeVar, byi byiVar, boolean z) {
        akwm akwmVar;
        String str;
        String str2;
        long j;
        long j2;
        Map mapD;
        List list;
        float f;
        yup yupVar = this.a;
        synchronized (yupVar) {
            boolean zU = yupVar.u(byiVar.a);
            Set set = this.b;
            if (!zU) {
                set.add(byeVar);
                return;
            }
            if (set.contains(byeVar)) {
                return;
            }
            if (byeVar instanceof jvf) {
                LivePlayerConfigOuterClass$LivePlayerConfig defaultInstance = yupVar.b.d.D;
                if (defaultInstance == null) {
                    defaultInstance = LivePlayerConfigOuterClass$LivePlayerConfig.getDefaultInstance();
                }
                if (defaultInstance.d) {
                    jvf jvfVar = (jvf) byeVar;
                    akwmVar = yupVar.b.d.f;
                    if (akwmVar == null) {
                        akwmVar = akwm.b;
                    }
                    str = akwmVar.X;
                    try {
                        str2 = null;
                        if (!TextUtils.isEmpty(str) && (mapD = jvfVar.d()) != null && (list = (List) mapD.get(str)) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 != null) {
                            j = Long.parseLong(str2);
                            if (j > 0) {
                                j2 = j << 3;
                            } else {
                                j2 = -1;
                            }
                        } else {
                            j2 = -1;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    LivePlayerConfigOuterClass$LivePlayerConfig defaultInstance2 = yupVar.b.d.D;
                    if (defaultInstance2 == null) {
                        defaultInstance2 = LivePlayerConfigOuterClass$LivePlayerConfig.getDefaultInstance();
                    }
                    if (defaultInstance2.e) {
                        jvf jvfVar2 = (jvf) byeVar;
                        akwmVar = yupVar.b.d.f;
                        if (akwmVar == null) {
                            akwmVar = akwm.b;
                        }
                        str = akwmVar.X;
                        str2 = null;
                        if (!TextUtils.isEmpty(str)) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 != null) {
                            j = Long.parseLong(str2);
                            if (j > 0) {
                                j2 = j << 3;
                            } else {
                                j2 = -1;
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = -1;
                    }
                }
                if (j2 != -1) {
                    yup yupVar2 = this.a;
                    aoqd aoqdVar = yupVar2.b.d;
                    if ((aoqdVar.b & 2) != 0) {
                        akwm akwmVar2 = aoqdVar.f;
                        if (akwmVar2 == null) {
                            akwmVar2 = akwm.b;
                        }
                        f = akwmVar2.ag;
                    } else {
                        f = 1.0f;
                    }
                    yupVar2.l((long) (j2 * (f > 0.0f ? f : 1.0f)));
                    this.b.add(byeVar);
                    return;
                }
            }
            this.a.p(false);
        }
    }

    @Override // defpackage.bzg
    public final void c(bye byeVar, byi byiVar, boolean z) {
    }
}
