package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dov {
    private static dov b;
    public final Object a;

    public dov(axfd axfdVar) {
        String str = ecu.a;
        ArrayList arrayList = new ArrayList(new awnl(new ecy[]{new ecw((edl) axfdVar.e), new ecx((edg) axfdVar.a), new edd((edl) axfdVar.c)}, true));
        if (Build.VERSION.SDK_INT >= 28) {
            Object systemService = ((Context) axfdVar.d).getSystemService("connectivity");
            systemService.getClass();
            arrayList.add(new ecm((ConnectivityManager) systemService));
        } else {
            Object obj = axfdVar.b;
            obj.getClass();
            edl edlVar = (edl) obj;
            List listAsList = Arrays.asList(new ecz(edlVar), new edc(edlVar), new edb((edl) axfdVar.b), new eda((edl) axfdVar.b));
            listAsList.getClass();
            arrayList.addAll(listAsList);
        }
        this.a = arrayList;
    }

    public static final void X(Throwable th) {
        if (th.getCause() instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        } else {
            twu.c(6, "Exception processing framework update.", th);
            zvp.b(zvn.b, zvm.e, "Exception processing framework update.", th);
        }
    }

    public static final albe Y(aigm aigmVar, Class cls) {
        try {
            afuu afuuVarD = afwt.d(76, "parseFut", afux.a, true);
            try {
                String.format("[TRANSPORT] About to route transport proto for %s type.", cls.getSimpleName());
                while (!aigmVar.D()) {
                    try {
                        int iN = aigmVar.n();
                        if ((iN >>> 3) == 777) {
                            if ((iN & 7) != 2) {
                                break;
                            }
                            aigmVar.f(aigmVar.k());
                            int iE = aigmVar.e();
                            albe albeVar = (albe) aihn.parseFrom(albe.a, aigmVar, ExtensionRegistryLite.getGeneratedRegistry());
                            afwt.i(wln.a, Integer.valueOf(aigmVar.e() - iE));
                            afuuVarD.close();
                            return albeVar;
                        }
                        aigmVar.F(iN);
                    } catch (Exception e) {
                        twu.d(twu.a, 5, "Error while advancing to field 777: " + e.toString(), null);
                    }
                }
                String.format("[TRANSPORT] No transport packet to process on field 777 %s", cls.getSimpleName());
                afuuVarD.close();
                return null;
            } catch (Throwable th) {
                try {
                    afuuVarD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            twu.d(twu.a, 6, "[TRANSPORT] Field 777 failed to parse", e2);
            return null;
        }
    }

    public static final void Z(Throwable th) {
        if ((th instanceof ExecutionException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        } else {
            X(th);
        }
    }

    public static synchronized dov aA() {
        dov dovVar;
        dovVar = b;
        if (dovVar == null) {
            dovVar = new dov((byte[]) null, (byte[]) null, (char[]) null);
            b = dovVar;
        }
        return dovVar;
    }

    private static void aB(byte[] bArr, int i, Key key, IvParameterSpec ivParameterSpec, int i2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = bArr[i3];
        }
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(ivParameterSpec.getIV());
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        byteBufferWrap.putLong(8, byteBufferWrap.getLong(8));
        cipher.init(i2, key, new IvParameterSpec(byteBufferWrap.array()));
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = bArrDoFinal[i4];
        }
    }

    public static byte[] aj(byte[] bArr, byte[] bArr2, Key key) {
        byte[] bArr3 = (byte[]) bArr2.clone();
        try {
            aB(bArr3, bArr3.length, key, new IvParameterSpec(bArr), 2);
            return bArr3;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new RuntimeException("Unable to decrypt Disco key.", e);
        }
    }

    public static byte[] ak(byte[] bArr, byte[] bArr2, Key key) {
        byte[] bArr3 = (byte[]) bArr2.clone();
        try {
            aB(bArr3, bArr3.length, key, new IvParameterSpec(bArr), 1);
            return bArr3;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new RuntimeException("Unable to encrypt Disco key.", e);
        }
    }

    public static dov az() {
        return new dov((Collection) agpr.a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Set] */
    public final void A(String str, Object obj, Object obj2, String str2, String str3, Boolean bool, String str4) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dov) it.next()).A(str, obj, obj2, str2, str3, bool, str4);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void B(String str, int i, ftg ftgVar, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dov) it.next()).B(str, i, ftgVar, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void C(String str, int i, ftg ftgVar, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dov) it.next()).C(str, i, ftgVar, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zrj] */
    public final String D() {
        return this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zrj] */
    public final void E(String str, long j) {
        this.a.b(str, String.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zrj] */
    public final void F(String str, String str2) {
        this.a.b(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zrj] */
    public final void G(String str, boolean z) {
        this.a.b(str, String.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zrj] */
    public final void H(String str, byte[] bArr) {
        this.a.b(str, Base64.encodeToString(bArr, 0));
    }

    public final double I() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.size() >= 4) {
            long j = ((zje) arrayDeque.getLast()).a - ((zje) arrayDeque.getFirst()).a;
            long j2 = ((zje) arrayDeque.getLast()).b - ((zje) arrayDeque.getFirst()).b;
            if (j >= 5000) {
                return (j2 * 1000) / j;
            }
        }
        return 0.0d;
    }

    public final zdm J(String str) {
        return (zdm) ((ConcurrentHashMap) this.a).get(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean K() {
        return !this.a.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    public final void L(String str, int i, long j, Duration duration, int i2) {
        this.a.put(str, new zdm(i, j, duration, i2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [agfr, java.lang.Object] */
    public final yzo M() {
        yzo yzoVar = (yzo) this.a.io();
        ahno.O(yzoVar != null);
        return yzoVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    public final void N(long j) {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        TextureView textureView;
        yzo yzoVarM = M();
        zlm zlmVar = yzoVarM.b.l;
        if (zlmVar instanceof zkt) {
            zlm zlmVar2 = ((zkt) zlmVar).d;
            if (zlmVar2 instanceof zkn) {
                zkn zknVar = (zkn) zlmVar2;
                zjr zjrVar = zknVar.f;
                boolean z = true;
                if (zjrVar.be()) {
                    long j2 = zknVar.g.get();
                    if (j != j2) {
                        SurfaceHolder surfaceHolder = zknVar.j;
                        Surface surface = surfaceHolder != null ? surfaceHolder.getSurface() : null;
                        boolean z2 = zknVar.p && surface != null && surface.isValid();
                        zll zllVar = zknVar.c;
                        if (zllVar instanceof yzo) {
                            ((yzo) zllVar).k(true, j, j2, z2);
                        }
                        if (z2) {
                            if (zknVar.p) {
                                if (zjrVar.eG()) {
                                    textureView = zknVar.m;
                                    if (textureView != null) {
                                        zknVar.bringChildToFront(zknVar.i);
                                        zknVar.bringChildToFront(zknVar.e);
                                        textureView.setAlpha(0.0f);
                                    }
                                    zknVar.p = false;
                                } else {
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
                                        if (zknVar.i.getSurfaceControl() == null) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        surfaceView2 = zknVar.k;
                                        if (surfaceView2 == null) {
                                            if (z) {
                                                transaction.apply();
                                            }
                                        } else if (z) {
                                            transaction.apply();
                                        }
                                    } else {
                                        zknVar.i.setAlpha(1.0f);
                                        surfaceView = zknVar.k;
                                        if (surfaceView != null) {
                                            surfaceView.setAlpha(0.0f);
                                        }
                                    }
                                    zknVar.p = false;
                                }
                            }
                        }
                    } else if (zknVar.p) {
                        if (zjrVar.eG()) {
                            textureView = zknVar.m;
                            if (textureView != null) {
                                zknVar.bringChildToFront(zknVar.i);
                                zknVar.bringChildToFront(zknVar.e);
                                textureView.setAlpha(0.0f);
                            }
                            zknVar.p = false;
                        } else {
                            if (Build.VERSION.SDK_INT >= 29) {
                                SurfaceControl.Transaction transaction2 = new SurfaceControl.Transaction();
                                if (zknVar.i.getSurfaceControl() == null && zknVar.i.getSurfaceControl().isValid()) {
                                    transaction2.setAlpha(zknVar.i.getSurfaceControl(), 1.0f);
                                } else {
                                    z = false;
                                }
                                surfaceView2 = zknVar.k;
                                if (surfaceView2 == null && surfaceView2.getSurfaceControl() != null && surfaceView2.getSurfaceControl().isValid()) {
                                    transaction2.setAlpha(surfaceView2.getSurfaceControl(), 0.0f);
                                } else if (z) {
                                }
                                transaction2.apply();
                            } else {
                                zknVar.i.setAlpha(1.0f);
                                surfaceView = zknVar.k;
                                if (surfaceView != null) {
                                    surfaceView.setAlpha(0.0f);
                                }
                            }
                            zknVar.p = false;
                        }
                    }
                } else if (zknVar.p) {
                    if (zjrVar.eG()) {
                        textureView = zknVar.m;
                        if (textureView != null) {
                            zknVar.bringChildToFront(zknVar.i);
                            zknVar.bringChildToFront(zknVar.e);
                            textureView.setAlpha(0.0f);
                        }
                        zknVar.p = false;
                    } else {
                        if (Build.VERSION.SDK_INT >= 29) {
                            SurfaceControl.Transaction transaction3 = new SurfaceControl.Transaction();
                            if (zknVar.i.getSurfaceControl() == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            surfaceView2 = zknVar.k;
                            if (surfaceView2 == null) {
                                if (z) {
                                    transaction3.apply();
                                }
                            } else if (z) {
                                transaction3.apply();
                            }
                        } else {
                            zknVar.i.setAlpha(1.0f);
                            surfaceView = zknVar.k;
                            if (surfaceView != null) {
                                surfaceView.setAlpha(0.0f);
                            }
                        }
                        zknVar.p = false;
                    }
                }
            }
            jux juxVar = yzoVarM.h;
            if (juxVar != null) {
                cdn cdnVarD = yzoVarM.d.d(juxVar);
                cdnVarD.g(10102);
                cdnVarD.e();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f5  */
    public final void O(long j) {
        SurfaceView surfaceView;
        SurfaceControl.Transaction transaction;
        SurfaceView surfaceView2;
        TextureView textureView;
        View view;
        TextureView textureView2;
        View view2;
        TextureView textureView3;
        yzo yzoVarM = M();
        zlm zlmVar = yzoVarM.b.l;
        if (zlmVar instanceof zkt) {
            zlm zlmVar2 = ((zkt) zlmVar).d;
            if (zlmVar2 instanceof zkn) {
                zkn zknVar = (zkn) zlmVar2;
                zjr zjrVar = zknVar.f;
                boolean z = false;
                if (zjrVar.be()) {
                    long j2 = zknVar.h.get();
                    if (j != j2) {
                        SurfaceHolder surfaceHolder = zknVar.l;
                        Surface surface = surfaceHolder != null ? surfaceHolder.getSurface() : null;
                        boolean z2 = !zknVar.p && ((surface != null && surface.isValid()) || ((textureView3 = zknVar.m) != null && textureView3.isAvailable()));
                        zll zllVar = zknVar.c;
                        if (zllVar instanceof yzo) {
                            ((yzo) zllVar).k(false, j, j2, z2);
                        }
                        if (z2) {
                            if (zknVar.p) {
                                if (zjrVar.eG()) {
                                    textureView2.setAlpha(1.0f);
                                    zknVar.bringChildToFront(zknVar.m);
                                    view2 = zknVar.e;
                                    if (view2.getVisibility() == 0) {
                                        zknVar.bringChildToFront(view2);
                                    }
                                }
                            } else if (zjrVar.eG()) {
                                textureView = zknVar.m;
                                if (textureView != null) {
                                    zknVar.bringChildToFront(textureView);
                                    view = zknVar.e;
                                    if (view.getVisibility() == 0) {
                                        zknVar.bringChildToFront(view);
                                    }
                                    textureView.setAlpha(1.0f);
                                }
                                zknVar.p = true;
                            } else {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    transaction = new SurfaceControl.Transaction();
                                    surfaceView2 = zknVar.k;
                                    if (surfaceView2 != null) {
                                        transaction.setAlpha(surfaceView2.getSurfaceControl(), 1.0f);
                                        z = true;
                                    }
                                    if (zknVar.i.getSurfaceControl() == null) {
                                        if (z) {
                                            transaction.apply();
                                        }
                                    } else if (z) {
                                        transaction.apply();
                                    }
                                } else {
                                    surfaceView = zknVar.k;
                                    if (surfaceView != null) {
                                        surfaceView.setAlpha(1.0f);
                                    }
                                    zknVar.i.setAlpha(0.0f);
                                }
                                zknVar.p = true;
                            }
                        }
                    } else if (zknVar.p) {
                        if (zjrVar.eG() && (textureView2 = zknVar.m) != null) {
                            textureView2.setAlpha(1.0f);
                            zknVar.bringChildToFront(zknVar.m);
                            view2 = zknVar.e;
                            if (view2.getVisibility() == 0) {
                                zknVar.bringChildToFront(view2);
                            }
                        }
                    } else if (zjrVar.eG()) {
                        textureView = zknVar.m;
                        if (textureView != null) {
                            zknVar.bringChildToFront(textureView);
                            view = zknVar.e;
                            if (view.getVisibility() == 0) {
                                zknVar.bringChildToFront(view);
                            }
                            textureView.setAlpha(1.0f);
                        }
                        zknVar.p = true;
                    } else {
                        if (Build.VERSION.SDK_INT >= 29) {
                            transaction = new SurfaceControl.Transaction();
                            surfaceView2 = zknVar.k;
                            if (surfaceView2 != null && surfaceView2.getSurfaceControl() != null && surfaceView2.getSurfaceControl().isValid()) {
                                transaction.setAlpha(surfaceView2.getSurfaceControl(), 1.0f);
                                z = true;
                            }
                            if (zknVar.i.getSurfaceControl() == null && zknVar.i.getSurfaceControl().isValid()) {
                                transaction.setAlpha(zknVar.i.getSurfaceControl(), 0.0f);
                            } else if (z) {
                            }
                            transaction.apply();
                        } else {
                            surfaceView = zknVar.k;
                            if (surfaceView != null) {
                                surfaceView.setAlpha(1.0f);
                            }
                            zknVar.i.setAlpha(0.0f);
                        }
                        zknVar.p = true;
                    }
                } else if (zknVar.p) {
                    if (zjrVar.eG()) {
                        textureView2.setAlpha(1.0f);
                        zknVar.bringChildToFront(zknVar.m);
                        view2 = zknVar.e;
                        if (view2.getVisibility() == 0) {
                            zknVar.bringChildToFront(view2);
                        }
                    }
                } else if (zjrVar.eG()) {
                    textureView = zknVar.m;
                    if (textureView != null) {
                        zknVar.bringChildToFront(textureView);
                        view = zknVar.e;
                        if (view.getVisibility() == 0) {
                            zknVar.bringChildToFront(view);
                        }
                        textureView.setAlpha(1.0f);
                    }
                    zknVar.p = true;
                } else {
                    if (Build.VERSION.SDK_INT >= 29) {
                        transaction = new SurfaceControl.Transaction();
                        surfaceView2 = zknVar.k;
                        if (surfaceView2 != null) {
                            transaction.setAlpha(surfaceView2.getSurfaceControl(), 1.0f);
                            z = true;
                        }
                        if (zknVar.i.getSurfaceControl() == null) {
                            if (z) {
                                transaction.apply();
                            }
                        } else if (z) {
                            transaction.apply();
                        }
                    } else {
                        surfaceView = zknVar.k;
                        if (surfaceView != null) {
                            surfaceView.setAlpha(1.0f);
                        }
                        zknVar.i.setAlpha(0.0f);
                    }
                    zknVar.p = true;
                }
            }
            jux juxVar = yzoVarM.h;
            if (juxVar != null) {
                cdn cdnVarD = yzoVarM.d.d(juxVar);
                cdnVarD.g(10102);
                cdnVarD.e();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, zeo] */
    public final void P(Object obj, Throwable th) {
        zsf zsfVar;
        ?? r3 = this.a;
        if (r3 != 0) {
            if ("ANDROID_EXOPLAYER_V2".equals("ANDROID_EXOPLAYER_V2")) {
                zsfVar = zsf.c;
            } else {
                zsfVar = "ANDROID_EXOPLAYER_V2".equals("PLATYPUS") ? zsf.d : null;
            }
            if (zsfVar != null) {
                if (th == null) {
                    th = null;
                }
                r3.j(zsfVar, (Surface) obj, (Exception) th);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final xif Q(String str) {
        ((Context) this.a.io()).getClass();
        return new xif(str);
    }

    public final void R(alou alouVar) {
        ((xeu) this.a).b(alouVar);
    }

    public final void S(alou alouVar, long j) {
        ((xeu) this.a).c(alouVar, j);
    }

    public final void T(alou alouVar, zwa zwaVar) {
        ((xeu) this.a).i(alouVar, zwaVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final ListenableFuture U(Executor executor, zwa zwaVar, albe albeVar) {
        ArrayList arrayList = null;
        for (wlc wlcVar : this.a) {
            if (wlcVar.d(albeVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(wlcVar.b(executor, zwaVar, albeVar));
            }
        }
        if (arrayList == null) {
            return aher.a;
        }
        int i = 7;
        return ahno.aE(arrayList).m(new wko(arrayList, 4), MoreExecutors.directExecutor()).b(Throwable.class, new vxq(i), MoreExecutors.directExecutor()).h(new oly(i), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    public final void V(zwa zwaVar, albe albeVar) {
        for (wlc wlcVar : this.a) {
            try {
                String.format("[TRANSPORT] About to process packet with %s", wlcVar.getClass().getSimpleName());
                wlcVar.c(zwaVar, albeVar);
            } catch (Throwable th) {
                X(th);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void W(zwa zwaVar, Class cls, byte[] bArr) {
        albe albeVarY;
        aigm aigmVarO = aigm.O(bArr, 0, bArr.length, false);
        if (this.a.isEmpty() || (albeVarY = Y(aigmVarO, cls)) == null) {
            return;
        }
        V(zwaVar, albeVarY);
    }

    public final dou a() {
        return (dou) ((aack) this.a).e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final agcg aa() {
        wkn wknVar = (wkn) this.a.io();
        wknVar.getClass();
        return new agcg(wknVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void ab(Consumer consumer) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            consumer.r(it.next());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void ac(Object obj) {
        obj.getClass();
        this.a.add(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void ad(Object obj) {
        obj.getClass();
        this.a.remove(obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final double ae(double d, double d2) {
        ahno.F(d <= d2);
        return d + (((Random) this.a.io()).nextDouble() * (d2 - d));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final String af(int i) {
        byte[] bArr = new byte[i];
        ((Random) this.a.io()).nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    public final File ag() throws FileNotFoundException {
        File filesDir = ((Context) this.a).getFilesDir();
        if (filesDir == null) {
            throw new FileNotFoundException();
        }
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        return sb.length() > 0 ? new File(filesDir, sb.toString()) : filesDir;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aunn, java.lang.Object] */
    public final Key ah() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(SemanticState.Focused, (SecureRandom) this.a.io());
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            twu.c(6, "AES not recognized as a supported algorithm", e);
            return null;
        }
    }

    public final Key ai(SharedPreferences sharedPreferences) {
        if (!sharedPreferences.contains("downloads_encryption_key")) {
            sharedPreferences.edit().putString("downloads_encryption_key", Base64.encodeToString(ah().getEncoded(), 0)).apply();
        }
        return new SecretKeySpec(Base64.decode(sharedPreferences.getString("downloads_encryption_key", null), 0), "AES");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final afyu al() {
        mbc mbcVar = (mbc) this.a.io();
        mbcVar.getClass();
        return new afyu(mbcVar);
    }

    public final void am() throws InterruptedException {
        ((Semaphore) this.a).acquire(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final void an() throws InterruptedException {
        ((Semaphore) this.a).acquire();
    }

    public final void ao() {
        ((Semaphore) this.a).release(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final void ap() {
        ((Semaphore) this.a).release();
    }

    public final boolean aq() {
        return ((Semaphore) this.a).tryAcquire();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v5, types: [awmd, java.lang.Object] */
    public final syk ar(String str) {
        oml omlVar = (oml) this.a.get(str);
        if (omlVar != null) {
            return (syk) omlVar.a.io();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Optional as(String str) {
        return Optional.ofNullable((snl) this.a.get(str));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    public final List at() {
        try {
            return new ArrayList(this.a.values());
        } catch (RuntimeException e) {
            zvn zvnVar = zvn.b;
            zvm zvmVar = zvm.a;
            boolean z = Looper.myLooper() == Looper.getMainLooper();
            zvp.a(zvnVar, zvmVar, "[Control flow v2] failed to grab registered triggers. Is main thread? " + z + ", error: " + e.getMessage() + ", stack: " + Arrays.toString(Thread.currentThread().getStackTrace()));
            return new ArrayList();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void au(String str) {
        Optional.ofNullable((snl) this.a.remove(str));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final agcg av() {
        Object objIo = this.a.io();
        objIo.getClass();
        return new agcg(objIo);
    }

    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [awmd, java.lang.Object] */
    public final ahsm aw(Intent intent, ComponentName componentName, boolean z, boolean z2) {
        Map map;
        Map map2;
        boolean z3;
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return new ahsm(intent, false, agpi.a);
            }
            agkz<String> agkzVarN = agkz.n(extras.keySet());
            if (extras.isEmpty()) {
                return new ahsm(intent, false, agpi.a);
            }
            String action = intent.getAction();
            ?? r9 = this.a;
            if (z) {
                sxj sxjVar = (sxj) r9.io();
                Optional optional = sxjVar.d;
                if (!optional.isPresent() || (map = (Map) optional.get().get(componentName)) == null) {
                    map = (Map) j$.util.Map.EL.getOrDefault(sxjVar.b, componentName, agpn.b);
                }
            } else {
                sxj sxjVar2 = (sxj) r9.io();
                if (componentName == null) {
                    map = agpn.b;
                } else {
                    Optional optional2 = sxjVar2.c;
                    if (!optional2.isPresent() || (map = (Map) optional2.get().get(componentName)) == null) {
                        map = (Map) j$.util.Map.EL.getOrDefault(sxjVar2.a, componentName, agpn.b);
                    }
                }
            }
            if (map != null) {
                if (action == null) {
                    action = "_ACTION_NONE";
                }
                map2 = (Map) map.get(action);
                if (map2 == null) {
                    map2 = (Map) map.get("_ACTION_ANY");
                }
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = agpn.b;
            }
            agjz agjzVar = new agjz(4);
            boolean z4 = false;
            for (String str : agkzVarN) {
                Set set = (Set) map2.get(str);
                try {
                    e = extras.get(str);
                    z3 = false;
                } catch (RuntimeException e) {
                    e = e;
                    z3 = true;
                }
                if (!z3 && set != null) {
                    if (e != null) {
                        Iterator it = set.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (!((Class) it.next()).isAssignableFrom(e.getClass()));
                    } else if (set.contains(Void.class)) {
                    }
                }
                extras.remove(str);
                agjzVar.h(new tld(str, e));
                z4 = true;
            }
            if (z4 && !z2) {
                intent.replaceExtras(extras);
            }
            return new ahsm(intent, z4, agjzVar.g());
        } catch (OutOfMemoryError | RuntimeException unused) {
            intent.replaceExtras(new Bundle());
            return new ahsm(intent, true, agpi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final vwt ax() {
        return new vwt((Map) this.a);
    }

    public final void ay(String str, tzk tzkVar) {
        ((HashMap) this.a).put(str, tzkVar);
    }

    public final void b() {
        ((aack) this.a).e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dow, java.lang.Object] */
    public final void c(Bundle bundle) {
        aack aackVar = (aack) this.a;
        if (!aackVar.a) {
            aackVar.e();
        }
        ?? r0 = aackVar.d;
        if (r0.getLifecycle().a().a(bob.d)) {
            bob bobVarA = r0.getLifecycle().a();
            Objects.toString(bobVarA);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(bobVarA)));
        }
        dpa dpaVar = (dpa) aackVar.c;
        if (dpaVar.b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key") && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) == null) {
            throw new IllegalArgumentException("No valid saved state was found for the key 'androidx.lifecycle.BundlableSavedStateRegistry.key'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
        }
        dpaVar.b(bundle2);
    }

    public final void d(Bundle bundle) {
        Bundle bundleA = ((dpa) ((aack) this.a).c).a();
        if (bundleA.isEmpty()) {
            return;
        }
        dox.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void e(doc docVar) {
        docVar.getClass();
        int i = docVar.a;
        ?? r3 = this.a;
        Integer numValueOf = Integer.valueOf(i);
        Object treeMap = r3.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            r3.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        Integer numValueOf2 = Integer.valueOf(docVar.b);
        if (treeMap2.containsKey(numValueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(numValueOf2) + " with " + docVar);
        }
        treeMap2.put(numValueOf2, docVar);
    }

    public final Class f() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.a).loadClass("androidx.window.extensions.WindowExtensions");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final dyp g() {
        dyp dypVar = new dyp((Map) this.a);
        azx.h(dypVar);
        return dypVar;
    }

    public final void h(dyp dypVar) {
        dypVar.getClass();
        i(dypVar.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void i(Map map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            ?? r2 = this.a;
            if (value == null) {
                value = null;
            } else {
                int i = awrn.a;
                awqv awqvVar = new awqv(value.getClass());
                if (!awrc.c(awqvVar, new awqv(Boolean.TYPE)) && !awrc.c(awqvVar, new awqv(Byte.TYPE)) && !awrc.c(awqvVar, new awqv(Integer.TYPE)) && !awrc.c(awqvVar, new awqv(Long.TYPE)) && !awrc.c(awqvVar, new awqv(Float.TYPE)) && !awrc.c(awqvVar, new awqv(Double.TYPE)) && !awrc.c(awqvVar, new awqv(String.class)) && !awrc.c(awqvVar, new awqv(Boolean[].class)) && !awrc.c(awqvVar, new awqv(Byte[].class)) && !awrc.c(awqvVar, new awqv(Integer[].class)) && !awrc.c(awqvVar, new awqv(Long[].class)) && !awrc.c(awqvVar, new awqv(Float[].class)) && !awrc.c(awqvVar, new awqv(Double[].class)) && !awrc.c(awqvVar, new awqv(String[].class))) {
                    int i2 = 0;
                    if (awrc.c(awqvVar, new awqv(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        String str2 = dyq.a;
                        objArr = new Boolean[length];
                        while (i2 < length) {
                            objArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                    } else if (awrc.c(awqvVar, new awqv(byte[].class))) {
                        value = dyq.a((byte[]) value);
                    } else if (awrc.c(awqvVar, new awqv(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length2 = iArr.length;
                        String str3 = dyq.a;
                        objArr = new Integer[length2];
                        while (i2 < length2) {
                            objArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                    } else if (awrc.c(awqvVar, new awqv(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length3 = jArr.length;
                        String str4 = dyq.a;
                        objArr = new Long[length3];
                        while (i2 < length3) {
                            objArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                    } else if (awrc.c(awqvVar, new awqv(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length4 = fArr.length;
                        String str5 = dyq.a;
                        objArr = new Float[length4];
                        while (i2 < length4) {
                            objArr[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                    } else {
                        if (!awrc.c(awqvVar, new awqv(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + awqvVar);
                        }
                        double[] dArr = (double[]) value;
                        int length5 = dArr.length;
                        String str6 = dyq.a;
                        objArr = new Double[length5];
                        while (i2 < length5) {
                            objArr[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                    }
                    value = objArr;
                }
            }
            r2.put(str, value);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void j(String str, byte[] bArr) {
        this.a.put(str, dyq.a(bArr));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void k(String str, Object obj) {
        this.a.put(str, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void l(ett ettVar, evx evxVar) {
        ?? r1 = this.a;
        if (evxVar.equals(r1.get(ettVar))) {
            r1.remove(ettVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean m(Class cls) {
        return this.a.containsKey(cls);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void n(esd esdVar) {
        this.a.put(esdVar.getClass(), esdVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void o(eir eirVar) {
        this.a.add(eirVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final void p(Path path) {
        ?? r5 = this.a;
        int size = r5.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            eir eirVar = (eir) r5.get(size);
            ThreadLocal threadLocal = enm.a;
            if (eirVar != null && !eirVar.a) {
                enm.d(path, ((ejb) eirVar.b).k() / 100.0f, ((ejb) eirVar.c).k() / 100.0f, ((ejb) eirVar.d).k() / 360.0f);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object] */
    public final awzc q(ees eesVar) {
        eesVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((ecy) obj).b(eesVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ecy) it.next()).a(eesVar.l));
        }
        return awzf.a(new ecs((awzc[]) atqq.ap(arrayList2).toArray(new awzc[0]), 0));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    public final vsr r() {
        Context context = (Context) ((dov) this.a).a.io();
        context.getClass();
        return new vsr(context);
    }

    public final void s(gvk gvkVar) {
        ((awly) this.a).kk(gvkVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aunn, java.lang.Object] */
    public final void t(String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            ((Context) this.a.io()).revokeSelfPermissionOnKill(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final agcg u() {
        mbc mbcVar = (mbc) this.a.io();
        mbcVar.getClass();
        return new agcg(mbcVar);
    }

    public final void v() {
        View currentFocus;
        IBinder windowToken;
        Activity activity = (Activity) this.a;
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getApplicationContext().getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final AtomicReference w(String str) {
        AtomicReference atomicReference;
        synchronized (this) {
            ?? r0 = this.a;
            if (!r0.containsKey(str)) {
                r0.put(str, new AtomicReference());
            }
            atomicReference = (AtomicReference) r0.get(str);
        }
        return atomicReference;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void x(String str, int i, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dov) it.next()).x(str, i, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void y(String str, int i, ftg ftgVar, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dov) it.next()).y(str, i, ftgVar, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void z(String str, int i, int i2, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dov) it.next()).z(str, i, i2, str2);
        }
    }

    public dov(Object obj) {
        this.a = obj;
    }

    public dov(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public dov() {
        this.a = new LinkedHashMap();
    }

    public dov(Context context, Optional optional) {
        sxe sxeVar = new sxe(new heg((char[]) null), 2);
        optional.isPresent();
        heg hegVar = (heg) sxeVar.a;
        if (hegVar.a == null) {
            hegVar.a = agpr.a;
        }
        this.a = context;
    }

    public dov(awmd awmdVar, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public dov(awmd awmdVar, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public dov(dpg dpgVar) {
        dpgVar.getClass();
        this.a = dpgVar;
    }

    public dov(char[] cArr, char[] cArr2) {
        this.a = new ConcurrentHashMap();
    }

    public dov(short[] sArr) {
        this.a = new awlo().az();
    }

    public dov(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public dov(awmd awmdVar, tqj tqjVar) {
        int i = tqr.a;
        if (tqjVar.k(1073815387)) {
            this.a = new gfy(17);
        } else if (tqjVar.k(1073815390)) {
            this.a = new gfy(18);
        } else {
            awmdVar.getClass();
            this.a = new glj(awmdVar, 11);
        }
    }

    public dov(byte[] bArr) {
        this.a = new LinkedHashMap();
    }

    public dov(byte[] bArr, short[] sArr) {
        this.a = new ArrayDeque();
    }

    public dov(eek eekVar) {
        eekVar.getClass();
        this.a = eekVar;
    }

    public dov(byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        this.a = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public dov(int[] iArr) {
        boolean z;
        boolean z2;
        Object zrlVar;
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073820286)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (tqjVar != null) {
            int i2 = tqr.a;
            z2 = tqjVar.k(1073830112);
        }
        if (z) {
            zrlVar = new zrk(z2);
        } else {
            zrlVar = new zrl();
        }
        this.a = zrlVar;
    }

    public dov(alrc alrcVar) {
        this.a = new wqe(alrcVar, 4);
    }

    public dov(Map map) {
        this.a = new ConcurrentHashMap(map);
    }

    public dov(Collection collection) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.a = copyOnWriteArraySet;
        collection.getClass();
        if (!collection.contains(null)) {
            copyOnWriteArraySet.addAll(collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    private dov(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new Semaphore(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public dov(awmd awmdVar, byte[] bArr, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public dov(tqj tqjVar) {
        tqjVar.getClass();
        this.a = tqjVar;
    }

    public dov(awmd awmdVar, short[] sArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public dov(short[] sArr, byte[] bArr) {
        this.a = new HashMap();
    }

    public dov(awmd awmdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public dov(char[] cArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public dov(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public dov(dov dovVar) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap((Map) dovVar.a));
    }

    public dov(char[] cArr) {
        this.a = new HashMap();
        new HashMap();
    }

    public dov(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = new ArrayList();
    }

    public dov(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new HashSet();
    }

    public dov(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashSet();
    }

    public dov(Context context, Executor executor) {
        ahfo ahfoVar = new ahfo(new ebs(context, 3));
        executor.execute(ahfoVar);
        this.a = ahfoVar;
    }

    public dov(byte[] bArr, char[] cArr) {
        this.a = new HashMap();
    }
}
