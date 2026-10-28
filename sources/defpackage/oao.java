package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oao {
    public final obj a;
    public final obw b;
    private final obc c;
    private final long d;
    private final aunn e;
    private final long f;
    private final long g = System.currentTimeMillis();
    private final boolean h;
    private final long i;
    private final boolean j;
    private final omj k;

    public oao(obj objVar, obw obwVar, omj omjVar, obc obcVar, aunn aunnVar, oaq oaqVar) {
        this.a = objVar;
        this.b = obwVar;
        this.k = omjVar;
        this.c = obcVar;
        this.d = oaqVar.l;
        this.e = aunnVar;
        this.f = oaqVar.k;
        this.h = oaqVar.u;
        this.i = oaqVar.t;
        this.j = oaqVar.B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final String a(Context context) {
        boolean z;
        String strJ;
        String strEncodeToString = "E";
        if (!this.h) {
            z = false;
        } else if (System.currentTimeMillis() - this.g <= this.i) {
            z = true;
        } else {
            z = false;
        }
        omj omjVar = this.k;
        boolean z2 = this.j;
        int i = 3;
        ofb ofbVarH = omjVar.h(3);
        obj objVar = this.a;
        ListenableFuture listenableFutureO = z2 ? ahng.o(objVar.a()) : objVar.a();
        idm idmVar = new idm(this, context, i, null);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        ahcq ahcqVar = new ahcq(listenableFutureO, idmVar);
        listenableFutureO.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
        try {
            try {
                try {
                    ofbVarH.c();
                    strJ = (String) ahcqVar.get(z ? this.f : this.d, TimeUnit.MILLISECONDS);
                } catch (ExecutionException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    ofbVarH.b(e);
                    strJ = "3";
                } catch (Throwable th) {
                    ofbVarH.b(th);
                    throw th;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ofbVarH.b(e2);
                strJ = "";
            } catch (TimeoutException unused) {
                if (this.j) {
                    ahcqVar.cancel(false);
                }
                if (z) {
                    odp odpVar = (odp) this.e.io();
                    long j = this.g;
                    ofb ofbVarH2 = odpVar.e.h(55);
                    try {
                        ofbVarH2.c();
                        aihf aihfVarCreateBuilder = fxn.a.createBuilder();
                        String str = odpVar.c;
                        aihfVarCreateBuilder.copyOnWrite();
                        fxn fxnVar = (fxn) aihfVarCreateBuilder.instance;
                        str.getClass();
                        fxnVar.b |= 2;
                        fxnVar.d = str;
                        aihfVarCreateBuilder.copyOnWrite();
                        fxn fxnVar2 = (fxn) aihfVarCreateBuilder.instance;
                        fxnVar2.b |= 1;
                        fxnVar2.c = "0.975916745";
                        Context context2 = odpVar.a;
                        String packageName = context2.getPackageName();
                        aihfVarCreateBuilder.copyOnWrite();
                        fxn fxnVar3 = (fxn) aihfVarCreateBuilder.instance;
                        packageName.getClass();
                        fxnVar3.b |= 8;
                        fxnVar3.f = packageName;
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        aihfVarCreateBuilder.copyOnWrite();
                        fxn fxnVar4 = (fxn) aihfVarCreateBuilder.instance;
                        fxnVar4.b |= 4;
                        fxnVar4.e = jCurrentTimeMillis;
                        long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
                        aihfVarCreateBuilder.copyOnWrite();
                        fxn fxnVar5 = (fxn) aihfVarCreateBuilder.instance;
                        fxnVar5.b |= 32;
                        fxnVar5.h = jCurrentTimeMillis2;
                        if (odpVar.d) {
                            try {
                                Signature[] signatureArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 64).signatures;
                                if (signatureArr != null && signatureArr.length > 0) {
                                    byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                                    StringBuilder sb = new StringBuilder();
                                    for (byte b : bArrDigest) {
                                        String hexString = Integer.toHexString(b & 255);
                                        if (hexString.length() == 1) {
                                            sb.append('0');
                                        }
                                        sb.append(hexString);
                                    }
                                    strEncodeToString = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                                }
                            } catch (Exception unused2) {
                            }
                            aihfVarCreateBuilder.copyOnWrite();
                            fxn fxnVar6 = (fxn) aihfVarCreateBuilder.instance;
                            strEncodeToString.getClass();
                            fxnVar6.b |= 64;
                            fxnVar6.i = strEncodeToString;
                        }
                        try {
                            Context context3 = odpVar.a;
                            long j2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionCode;
                            aihfVarCreateBuilder.copyOnWrite();
                            fxn fxnVar7 = (fxn) aihfVarCreateBuilder.instance;
                            fxnVar7.b |= 16;
                            fxnVar7.g = j2;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            aihfVarCreateBuilder.copyOnWrite();
                            fxn fxnVar8 = (fxn) aihfVarCreateBuilder.instance;
                            fxnVar8.b |= 16;
                            fxnVar8.g = -1L;
                        }
                        ocd ocdVar = odpVar.b;
                        if (!ocdVar.c()) {
                            ocdVar.a();
                        }
                        aihf aihfVarG = ocdVar.g(((fxn) aihfVarCreateBuilder.build()).toByteArray(), null);
                        aihfVarG.copyOnWrite();
                        fxp fxpVar = (fxp) aihfVarG.instance;
                        fxp fxpVar2 = fxp.a;
                        fxpVar.e = 4;
                        fxpVar.b |= 2;
                        aihfVarG.copyOnWrite();
                        fxp fxpVar3 = (fxp) aihfVarG.instance;
                        fxpVar3.f = 1;
                        fxpVar3.b |= 4;
                        strJ = agyg.e.g().j(((fxp) aihfVarG.build()).toByteArray());
                        ofbVarH2.a();
                    } catch (Throwable th2) {
                        try {
                            ofbVarH2.b(th2);
                            throw th2;
                        } catch (Throwable th3) {
                            ofbVarH2.a();
                            throw th3;
                        }
                    }
                } else {
                    this.k.j(56);
                    strJ = "17";
                }
            }
            ofbVarH.a();
            this.c.a();
            return strJ;
        } catch (Throwable th4) {
            ofbVarH.a();
            this.c.a();
            throw th4;
        }
    }

    public final String b(Context context, String str) {
        String str2;
        ofb ofbVarH = this.k.h(5);
        boolean z = this.j;
        obj objVar = this.a;
        ListenableFuture listenableFutureF = ahcs.f(z ? ahng.o(objVar.a()) : objVar.a(), new ojk(this, context, str, 1), MoreExecutors.directExecutor());
        try {
            try {
                try {
                    try {
                        try {
                            ofbVarH.c();
                            str2 = (String) listenableFutureF.get(this.d, TimeUnit.MILLISECONDS);
                        } catch (TimeoutException unused) {
                            if (this.j) {
                                listenableFutureF.cancel(false);
                            }
                            this.k.j(58);
                            str2 = "17";
                        }
                    } catch (ExecutionException e) {
                        e = e;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        ofbVarH.b(e);
                        str2 = "3";
                    }
                } catch (Throwable th) {
                    ofbVarH.b(th);
                    throw th;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ofbVarH.b(e2);
                str2 = "";
            }
            ofbVarH.a();
            this.c.a();
            return str2;
        } catch (Throwable th2) {
            ofbVarH.a();
            this.c.a();
            throw th2;
        }
    }
}
