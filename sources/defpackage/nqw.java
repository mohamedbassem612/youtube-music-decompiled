package defpackage;

import android.graphics.Color;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.system.Os;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nqw {
    public static avlb a(nrw nrwVar, mew mewVar, nrv nrvVar) {
        try {
            CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) aihn.parseFrom(CommandOuterClass$Command.a, mewVar.f(), ExtensionRegistryLite.getGeneratedRegistry());
            aihl aihlVarCheckIsLite = aihn.checkIsLite(nrwVar.a());
            commandOuterClass$Command.c(aihlVarCheckIsLite);
            Object objK = commandOuterClass$Command.j.k(aihlVarCheckIsLite.d);
            return nrwVar.c(objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK), nrvVar);
        } catch (aiik e) {
            return avlb.m(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object b(pxd pxdVar, String str, int i, int i2, awoq awoqVar) throws Throwable {
        pxb pxbVar;
        Exception e;
        pkx pkxVar;
        if (awoqVar instanceof pxb) {
            pxbVar = (pxb) awoqVar;
            int i3 = pxbVar.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pxbVar.b = i3 - Integer.MIN_VALUE;
            } else {
                pxbVar = new pxb(pxdVar, awoqVar);
            }
        } else {
            pxbVar = new pxb(pxdVar, awoqVar);
        }
        Object obj = pxbVar.a;
        awox awoxVar = awox.a;
        int i4 = pxbVar.b;
        if (i4 == 0) {
            atqp.j(obj);
            pkx pkxVar2 = pkx.w;
            try {
                sxv sxvVarC = sxv.c();
                ((zzx) pxdVar).d.k(Uri.parse(str), sxvVarC);
                ListenableFuture listenableFutureE = ahcs.e(sxvVarC, afwl.a(new zzw(i, i2, 0)), MoreExecutors.directExecutor());
                pxbVar.c = pkxVar2;
                pxbVar.b = 1;
                Object objAd = awrc.ad(listenableFutureE, pxbVar);
                if (objAd == awoxVar) {
                    return awoxVar;
                }
                obj = objAd;
                pkxVar = pkxVar2;
            } catch (Exception e2) {
                e = e2;
                pkxVar = pkxVar2;
                awro.A(pxbVar.getContext());
                return new pkv(e, pkxVar);
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkxVar = pxbVar.c;
            try {
                atqp.j(obj);
            } catch (Exception e3) {
                e = e3;
                awro.A(pxbVar.getContext());
                return new pkv(e, pkxVar);
            }
        }
        return new pla(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object c(pxd pxdVar, String str, awoq awoqVar) throws Throwable {
        pxc pxcVar;
        Exception e;
        pkx pkxVar;
        ListenableFuture listenableFutureE;
        if (awoqVar instanceof pxc) {
            pxcVar = (pxc) awoqVar;
            int i = pxcVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pxcVar.b = i - Integer.MIN_VALUE;
            } else {
                pxcVar = new pxc(pxdVar, awoqVar);
            }
        } else {
            pxcVar = new pxc(pxdVar, awoqVar);
        }
        Object obj = pxcVar.a;
        awox awoxVar = awox.a;
        int i2 = pxcVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            pkx pkxVar2 = pkx.w;
            try {
                if (((zzx) pxdVar).h.l(24, 45718674L, false)) {
                    listenableFutureE = ahng.n(zzx.c);
                } else {
                    sxv sxvVarC = sxv.c();
                    ((zzx) pxdVar).d.m(Uri.parse(str), sxvVarC);
                    listenableFutureE = ahcs.e(sxvVarC, afwl.a(new xwd(pxdVar, 11)), ((zzx) pxdVar).f);
                }
                pxcVar.c = pkxVar2;
                pxcVar.b = 1;
                Object objAd = awrc.ad(listenableFutureE, pxcVar);
                if (objAd == awoxVar) {
                    return awoxVar;
                }
                obj = objAd;
                pkxVar = pkxVar2;
            } catch (Exception e2) {
                e = e2;
                pkxVar = pkxVar2;
                awro.A(pxcVar.getContext());
                return new pkv(e, pkxVar);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkxVar = pxcVar.c;
            try {
                atqp.j(obj);
            } catch (Exception e3) {
                e = e3;
                awro.A(pxcVar.getContext());
                return new pkv(e, pkxVar);
            }
        }
        return new pla(obj);
    }

    public static int d(atyv atyvVar) {
        float f;
        if ((atyvVar.b & 1) != 0) {
            aihd aihdVar = atyvVar.f;
            if (aihdVar == null) {
                aihdVar = aihd.a;
            }
            f = aihdVar.b;
        } else {
            f = 1.0f;
        }
        return Color.argb(((int) (f * 255.0f)) & 255, ((int) (atyvVar.c * 255.0f)) & 255, ((int) (atyvVar.d * 255.0f)) & 255, ((int) (atyvVar.e * 255.0f)) & 255);
    }

    public static boolean e(MediaFormat mediaFormat) {
        String str;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        try {
            int integer = mediaFormat.getInteger("color-transfer", 0);
            int integer2 = mediaFormat.getInteger("color-standard", 0);
            return integer2 != 0 && integer != 0 && bru.i(new bru(-1, -1, integer, null, -1, -1)) && integer2 == 6;
        } catch (NullPointerException unused) {
            String str2 = qtv.a;
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                String className = stackTraceElement.getClassName();
                if (!className.equals(qtv.b) && className.startsWith("com.google.android.")) {
                    str = className.substring(19) + '.' + stackTraceElement.getMethodName() + ':' + stackTraceElement.getLineNumber();
                    Log.w(str2, str.concat(" Color Transfer or Color standard null. Tone mapping not applied."), null);
                    return false;
                }
            }
            str = "(unknown)";
            Log.w(str2, str.concat(" Color Transfer or Color standard null. Tone mapping not applied."), null);
            return false;
        }
    }

    public static IOException f(ayq ayqVar, Uri uri, IOException iOException, String str) {
        try {
            qqr qqrVar = new qqr();
            qqrVar.b();
            File file = (File) ayqVar.X(uri, qqrVar);
            if (!file.exists()) {
                return i(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? i(file, iOException, str) : i(file, iOException, str);
                }
                return file.canWrite() ? i(file, iOException, str) : i(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? i(file, iOException, str) : i(file, iOException, str);
            }
            return file.canWrite() ? i(file, iOException, str) : i(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static final xsc g(String str, StringBuilder sb, ArrayList arrayList) {
        return new xsc((Object) str, (Object) sb.toString(), arrayList.toArray(new String[arrayList.size()]), (char[]) null);
    }

    private static IOException h(File file, IOException iOException, String str) {
        String strConcat;
        try {
            strConcat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                strConcat = strConcat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    private static IOException i(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return h(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return h(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? h(file, iOException, str) : h(file, iOException, str);
            }
            return parentFile.canWrite() ? h(file, iOException, str) : h(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? h(file, iOException, str) : h(file, iOException, str);
        }
        return parentFile.canWrite() ? h(file, iOException, str) : h(file, iOException, str);
    }
}
