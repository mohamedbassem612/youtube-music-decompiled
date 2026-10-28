package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class odz implements kww {
    private final Context a;
    private final String b;
    private final long c;
    private final long d;
    private final omj e;
    private final omj f;

    public odz(Context context, oaq oaqVar, omj omjVar, omj omjVar2) {
        this.a = context;
        this.b = oaqVar.g;
        this.c = oaqVar.n;
        this.d = oaqVar.o;
        this.f = omjVar;
        this.e = omjVar2;
    }

    @Override // defpackage.kww
    public final Map a() {
        ofb ofbVarH = this.e.h(15009);
        try {
            ofbVarH.c();
            Map mapN = this.f.n();
            e(mapN);
            return mapN;
        } finally {
            ofbVarH.a();
        }
    }

    @Override // defpackage.kww
    public final Map b() {
        ofb ofbVarH = this.e.h(15009);
        try {
            ofbVarH.c();
            Map mapO = this.f.o();
            e(mapO);
            return mapO;
        } finally {
            ofbVarH.a();
        }
    }

    @Override // defpackage.kww
    public final Map c() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.kww
    public final Map d() {
        ofb ofbVarH = this.e.h(15009);
        try {
            ofbVarH.c();
            omj omjVar = this.f;
            Context context = this.a;
            HashMap map = new HashMap();
            Iterator it = omjVar.a.iterator();
            while (it.hasNext()) {
                ((oel) it.next()).d(map, context);
            }
            e(map);
            return map;
        } finally {
            ofbVarH.a();
        }
    }

    final void e(Map map) {
        String str;
        byte[] bArrG;
        String strA;
        Long lValueOf;
        Object obj;
        map.put("v", this.b);
        map.put("t", new Throwable());
        long j = -1;
        String str2 = null;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
            if (listenableFuture != null) {
                try {
                    ofb ofbVarH = this.e.h(15010);
                    try {
                        ofbVarH.c();
                        fxl fxlVar = (fxl) listenableFuture.get(this.c, TimeUnit.MILLISECONDS);
                        if (fxlVar == null) {
                            str = "E";
                            bArrG = null;
                            strA = null;
                            lValueOf = null;
                        } else {
                            if ((fxlVar.e & 64) != 0) {
                                fxo fxoVar = fxlVar.an;
                                if (fxoVar == null) {
                                    fxoVar = fxo.a;
                                }
                                if ((fxoVar.b & 4) != 0) {
                                    bArrG = fxoVar.e.G();
                                    try {
                                        strA = fxoVar.e.A(StandardCharsets.ISO_8859_1);
                                    } catch (Throwable th) {
                                        th = th;
                                        obj = null;
                                        ofbVarH.a();
                                        throw th;
                                    }
                                } else {
                                    bArrG = null;
                                    strA = null;
                                }
                                try {
                                    lValueOf = (fxoVar.b & 1) != 0 ? Long.valueOf(fxoVar.c) : null;
                                    try {
                                        if ((fxoVar.b & 2) != 0) {
                                            str2 = fxoVar.d;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        ofbVarH.a();
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    ofbVarH.a();
                                    throw th;
                                }
                            } else {
                                bArrG = null;
                                strA = null;
                                lValueOf = null;
                            }
                            str = (fxlVar.t.length() <= 1 || fxlVar.t.equals("0000000000000000000000000000000000000000000000000000000000000000")) ? "E" : fxlVar.t;
                            try {
                                if ((fxlVar.c & 1048576) != 0) {
                                    j = fxlVar.T;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                ofbVarH.a();
                                throw th;
                            }
                        }
                        ofbVarH.a();
                    } catch (Throwable th5) {
                        th = th5;
                        obj = null;
                    }
                } catch (ClassCastException | ExecutionException unused) {
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                } catch (TimeoutException unused3) {
                    this.e.j(15012);
                }
            } else {
                str = "E";
                bArrG = null;
                strA = null;
                lValueOf = null;
            }
        } catch (ClassCastException | ExecutionException unused4) {
        } catch (InterruptedException unused5) {
            str = "E";
            bArrG = null;
            strA = null;
            lValueOf = null;
        } catch (TimeoutException unused6) {
            str = "E";
            bArrG = null;
            strA = null;
            lValueOf = null;
        }
        if (str.equals("E")) {
            try {
                try {
                    ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
                    if (listenableFuture2 != null) {
                        ofb ofbVarH2 = this.e.h(15011);
                        try {
                            ofbVarH2.c();
                            String str3 = (String) listenableFuture2.get(this.d, TimeUnit.MILLISECONDS);
                            if (true != ahno.aa(str3)) {
                                str = str3;
                            }
                            ofbVarH2.a();
                        } catch (Throwable th6) {
                            ofbVarH2.a();
                            throw th6;
                        }
                    }
                } catch (ClassCastException | ExecutionException unused7) {
                }
            } catch (InterruptedException unused8) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused9) {
                this.e.j(15013);
            }
        }
        map.put("int", str);
        if (bArrG != null) {
            map.put("attb", bArrG);
        }
        if (strA != null) {
            map.put("att", strA);
        }
        if (lValueOf != null) {
            map.put("attts", lValueOf);
        }
        if (str2 != null) {
            map.put("attkid", str2);
        }
        map.put("gv", Long.valueOf(j));
    }
}
