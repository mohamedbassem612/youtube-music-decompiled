package defpackage;

import android.app.Notification;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aup {
    static Notification.ProgressStyle.Point a(aur aurVar) {
        return new Notification.ProgressStyle.Point(aurVar.a).setColor(aurVar.c).setId(aurVar.b);
    }

    static Notification.ProgressStyle.Segment b(aus ausVar) {
        return new Notification.ProgressStyle.Segment(ausVar.a).setColor(ausVar.c).setId(ausVar.b);
    }

    static void c(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    static void d(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    static void e(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    static void f(Notification.ProgressStyle progressStyle, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressPoint(a((aur) it.next()));
        }
    }

    static void g(Notification.ProgressStyle progressStyle, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressSegment(b((aus) it.next()));
        }
    }

    static void h(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    static void i(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    static void j(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }

    public static Object k(int i) {
        switch (i - 1) {
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            default:
                return BlendMode.LIGHTEN;
        }
    }

    public static int l(Throwable th, int i) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            return bwp.k(bwp.l(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (!(th instanceof MediaDrmResetException)) {
            if (!(th instanceof NotProvisionedException) && !m(th)) {
                if (th instanceof DeniedByServerException) {
                    return 6007;
                }
                if (th instanceof cko) {
                    return 6001;
                }
                if (th instanceof cjq) {
                    return 6003;
                }
                if (th instanceof ckk) {
                    return 6008;
                }
                if (i != 1) {
                    if (i == 2) {
                        return 6004;
                    }
                }
            }
            return 6002;
        }
        return 6006;
    }

    public static boolean m(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean n(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static void o(cju cjuVar, cju cjuVar2) {
        if (cjuVar != cjuVar2) {
            if (cjuVar2 != null) {
                cjuVar2.o(null);
            }
            if (cjuVar != null) {
                cjuVar.p(null);
            }
        }
    }

    public static eol p(bye byeVar, String str, byte[] bArr, Map map) throws Throwable {
        byi byiVar;
        Map map2;
        List list;
        bze bzeVar = new bze(byeVar);
        byh byhVar = new byh();
        byhVar.b(str);
        byhVar.f = map;
        byhVar.d = 2;
        byhVar.e = bArr;
        byhVar.j = 1;
        byi byiVarA = byhVar.a();
        int i = 0;
        byi byiVarA2 = byiVarA;
        while (true) {
            try {
                byg bygVar = new byg(bzeVar, byiVarA2);
                try {
                    byte[] bArrB = agyi.b(bygVar);
                    byiVar = byiVarA;
                    try {
                        try {
                            cnc cncVar = new cnc(-1L, byiVar, SystemClock.elapsedRealtime());
                            cncVar.d = bzeVar.b;
                            cncVar.e = bzeVar.c;
                            cncVar.g = bArrB.length;
                            cnd cndVar = new cnd(cncVar);
                            ckl cklVar = new ckl(bArrB);
                            cklVar.b = cndVar;
                            eol eolVar = new eol(cklVar);
                            int i2 = bwp.a;
                            afxw.h(bygVar);
                            return eolVar;
                        } catch (byv e) {
                            e = e;
                            int i3 = e.d;
                            String str2 = null;
                            if ((i3 == 307 || i3 == 308) && i < 5 && (map2 = e.e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                                str2 = (String) list.get(0);
                            }
                            if (str2 == null) {
                                throw e;
                            }
                            i++;
                            byh byhVar2 = new byh(byiVarA2);
                            byhVar2.b(str2);
                            byiVarA2 = byhVar2.a();
                            try {
                                int i4 = bwp.a;
                                afxw.h(bygVar);
                                byiVarA = byiVar;
                            } catch (Exception e2) {
                                e = e2;
                                throw new ckn(byiVar, bzeVar.b, bzeVar.d(), bzeVar.a, e);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        int i5 = bwp.a;
                        afxw.h(bygVar);
                        throw th2;
                    }
                } catch (byv e3) {
                    e = e3;
                    byiVar = byiVarA;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    int i6 = bwp.a;
                    afxw.h(bygVar);
                    throw th4;
                }
                byiVarA = byiVar;
            } catch (Exception e4) {
                e = e4;
                byiVar = byiVarA;
            }
        }
    }
}
