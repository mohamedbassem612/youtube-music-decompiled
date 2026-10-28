package defpackage;

import android.os.Build;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$AuthorizedFormat;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yvq {
    public static final /* synthetic */ int a = 0;
    private static final agkz b = agkz.r(akvr.DRM_TRACK_TYPE_HD, akvr.DRM_TRACK_TYPE_UHD1, akvr.DRM_TRACK_TYPE_UHD2);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r5.equals("L1") != false) goto L17;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int a(defpackage.ckd r5) {
        /*
            java.lang.Class<yvq> r0 = defpackage.yvq.class
            monitor-enter(r0)
            r1 = -1
            java.lang.String r2 = "securityLevel"
            java.lang.String r5 = r5.c(r2)     // Catch: java.lang.RuntimeException -> L33 java.lang.Throwable -> L4d
            int r2 = r5.hashCode()     // Catch: java.lang.RuntimeException -> L33 java.lang.Throwable -> L4d
            switch(r2) {
                case 2405: goto L26;
                case 2406: goto L1d;
                case 2407: goto L12;
                default: goto L11;
            }
        L11:
            goto L31
        L12:
            java.lang.String r2 = "L3"
            boolean r5 = r5.equals(r2)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L31
            monitor-exit(r0)
            r1 = 3
            goto L4a
        L1d:
            java.lang.String r2 = "L2"
            boolean r5 = r5.equals(r2)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L31
            goto L2e
        L26:
            java.lang.String r2 = "L1"
            boolean r5 = r5.equals(r2)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L31
        L2e:
            monitor-exit(r0)
            r1 = 1
            goto L4a
        L31:
            monitor-exit(r0)
            goto L4a
        L33:
            r5 = move-exception
            zvn r2 = defpackage.zvn.a     // Catch: java.lang.Throwable -> L4d
            zvm r3 = defpackage.zvm.f     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = r5.getLocalizedMessage()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = "Cannot get mediaDrm securityLevel "
            java.lang.String r5 = r4.concat(r5)     // Catch: java.lang.Throwable -> L4d
            defpackage.zvp.a(r2, r3, r5)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
        L4a:
            return r1
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r5
        L4d:
            r5 = move-exception
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvq.a(ckd):int");
    }

    public static zhz b(yvl yvlVar, Optional optional) {
        yvm yvmVar = yvlVar.a;
        Throwable cause = yvlVar.getCause();
        zhv zhvVar = new zhv("");
        zhvVar.a = optional;
        zhw zhwVar = zhw.e;
        zhvVar.b = zhwVar;
        zhvVar.d = yvlVar;
        zhz zhzVarA = zhvVar.a();
        if (yvmVar != null) {
            zhv zhvVar2 = new zhv("auth");
            zhvVar2.a = optional;
            zhvVar2.b = zhwVar;
            zhvVar2.d = yvlVar;
            zhvVar2.b(yvmVar);
            return zhvVar2.a();
        }
        boolean z = yvlVar.c;
        if (cause instanceof toe) {
            return f(cause, z, zhzVarA, optional);
        }
        if (!(cause instanceof wno)) {
            return zhzVarA;
        }
        Throwable cause2 = cause.getCause();
        return cause2 instanceof toe ? f(cause2, z, zhzVarA, optional) : zhzVarA;
    }

    public static String c(ckd ckdVar) {
        if (Build.VERSION.SDK_INT < 28) {
            return "";
        }
        try {
            return aaqc.c(((cki) ckdVar).a.getPropertyByteArray("metrics"));
        } catch (Exception e) {
            zhr.c(zhq.DRM, e, "Failed to retrieve DRM Metrics", new Object[0]);
            return "";
        }
    }

    public static boolean d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InnertubeDrmService$AuthorizedFormat innertubeDrmService$AuthorizedFormat = (InnertubeDrmService$AuthorizedFormat) it.next();
            agkz agkzVar = b;
            akvr akvrVarA = akvr.a(innertubeDrmService$AuthorizedFormat.c);
            if (akvrVarA == null) {
                akvrVarA = akvr.DRM_TRACK_TYPE_UNSPECIFIED;
            }
            if (agkzVar.contains(akvrVarA) || innertubeDrmService$AuthorizedFormat.e) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(agke agkeVar) {
        int size = agkeVar.size();
        int i = 0;
        while (i < size) {
            boolean z = ((InnertubeDrmService$AuthorizedFormat) agkeVar.get(i)).e;
            i++;
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static zhz f(Throwable th, boolean z, zhz zhzVar, Optional optional) {
        tnm tnmVar = ((toe) th).b;
        if (tnmVar != null) {
            String str = true != z ? "info." : "info.provisioning.";
            zhv zhvVar = new zhv("net.badstatus");
            zhvVar.a = optional;
            zhvVar.b = zhw.e;
            zhvVar.c = str + tnmVar.d;
            zhvVar.e = true;
            return zhvVar.a();
        }
        if (th instanceof tod) {
            zhv zhvVar2 = new zhv("net.timeout");
            zhvVar2.a = optional;
            zhvVar2.b = zhw.e;
            zhvVar2.c = true == z ? "info.provisioning" : null;
            zhvVar2.e = true;
            return zhvVar2.a();
        }
        if (th instanceof tni) {
            zhv zhvVar3 = new zhv("net.connect");
            zhvVar3.a = optional;
            zhvVar3.b = zhw.e;
            zhvVar3.c = true == z ? "info.provisioning" : null;
            zhvVar3.e = true;
            return zhvVar3.a();
        }
        if (!(th instanceof tmg) && !(th instanceof tnc)) {
            return zhzVar;
        }
        zhv zhvVar4 = new zhv("auth");
        zhvVar4.a = optional;
        zhvVar4.b = zhw.e;
        zhvVar4.c = true == z ? "info.provisioning" : null;
        return zhvVar4.a();
    }
}
