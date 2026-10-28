package defpackage;

import android.system.Os;
import android.system.OsConstants;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import internal.org.jni_zero.JniZero;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wkx extends wlo {
    public final wlu l;
    public final wmf m;
    public final zyv n;
    public final zyv o;
    private final zza p;
    private final agfr q;
    private final wmk r;
    private final wls s;
    private agfr t;

    public wkx(wlu wluVar, zza zzaVar, vyt vytVar, tnr tnrVar, boolean z, ainp ainpVar, MessageLite messageLite, wmk wmkVar, wmf wmfVar, wls wlsVar, zyv zyvVar, zyv zyvVar2) {
        super(wluVar, zzaVar, vytVar, tnrVar, ainpVar);
        messageLite.getClass();
        this.q = aguu.al(new wkw(messageLite, 0));
        this.l = wluVar;
        zzaVar.getClass();
        this.p = zzaVar;
        this.g = z;
        this.d = this;
        this.r = wmkVar;
        this.m = wmfVar;
        this.s = wlsVar;
        this.n = zyvVar;
        this.o = zyvVar2;
    }

    private final void X() {
        wmf wmfVar = this.m;
        wmfVar.j();
        wls wlsVar = this.s;
        uny unyVar = null;
        if (wlsVar.c && wlsVar.a.a()) {
            unyVar = new uny(wlsVar, 14);
        }
        if (unyVar != null) {
            wmfVar.f(unyVar);
        }
    }

    @Override // defpackage.tmn, defpackage.tns
    public final boolean E() {
        return this.s.c();
    }

    @Override // defpackage.tmn, defpackage.tns
    public final boolean F() {
        return true;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final synchronized boolean H() {
        agfr agfrVarAl;
        agfrVarAl = this.t;
        if (agfrVarAl == null) {
            agfrVarAl = aguu.al(new wkw(this, 2));
            this.t = agfrVarAl;
        }
        return ((Boolean) agfrVarAl.io()).booleanValue();
    }

    @Override // defpackage.tmn, defpackage.tns
    public final boolean J() {
        return true;
    }

    @Override // defpackage.zyn, defpackage.zyg
    public final zwa P() {
        return this.l.h();
    }

    @Override // defpackage.zyn, defpackage.zyg
    public final zwa Q() {
        return this.l.u;
    }

    @Override // defpackage.zyn, defpackage.zyg
    public final String R() {
        return this.l.s;
    }

    @Override // defpackage.wlo, defpackage.tns
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void ad(MessageLite messageLite) {
        this.m.i();
        this.p.a(messageLite);
    }

    @Override // defpackage.wlo
    @Deprecated
    public final void T() {
        this.m.g();
    }

    @Override // defpackage.wlo
    @Deprecated
    public final void U() {
        this.m.h();
    }

    @Override // defpackage.wlo
    public final void V() {
        taq.c();
        wmf wmfVar = this.m;
        wmfVar.k();
        try {
            wmfVar.e();
        } catch (tmg unused) {
        }
        wmfVar.d();
        wmfVar.b();
    }

    @Override // defpackage.zyn, defpackage.zyg
    public final boolean W() {
        return this.l.u();
    }

    @Override // defpackage.tnz
    public final int a() {
        int i = tqr.a;
        tqj tqjVar = this.m.d;
        if (tqjVar.a(1075321409) <= 0) {
            return 60000;
        }
        return tqjVar.a(1075321409);
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        throw new UnsupportedOperationException("DefaultInnerTubeProtoRequest only supports async parsing.");
    }

    @Override // defpackage.wlo, defpackage.tns
    public final Class ab() {
        return (Class) this.q.io();
    }

    @Override // defpackage.tmn, defpackage.tns
    public final byte[] ae() {
        return this.m.k();
    }

    @Override // defpackage.tnz
    public final int b() {
        return (int) this.s.b.a;
    }

    @Override // defpackage.tnz
    public final Duration d(toe toeVar) {
        Duration durationA = this.s.a(toeVar);
        if (durationA != null) {
            X();
        }
        return durationA;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final Map e() {
        return this.m.e();
    }

    @Override // defpackage.tnz
    public final void f(toe toeVar) {
        this.s.b(toeVar);
        X();
    }

    @Override // defpackage.tmn, defpackage.tns
    public final toe i(toe toeVar) {
        wla wlaVar = (wla) p(wla.class);
        if (wlaVar != null) {
            z(wlaVar);
        }
        wlu wluVar = this.l;
        String str = wluVar.t;
        wkz wkzVarA = wla.a();
        wkzVarA.a = str;
        wkzVarA.z(b());
        wkzVarA.u(wluVar.i());
        wkzVarA.q(wluVar.v());
        if (toeVar instanceof tob) {
            tyo tyoVar = new tyo(toeVar);
            int i = tyoVar.c.b;
            Iterator it = tyoVar.b().iterator();
            agjz agjzVar = null;
            while (it.hasNext()) {
                String str2 = ((aifv) it.next()).b;
                if (str2 != null) {
                    if (agjzVar == null) {
                        agjzVar = new agjz(4);
                    }
                    agjzVar.h(str2);
                }
            }
            wkzVarA.b = new wly(i, agjzVar != null ? agjzVar.g() : agpi.a);
            toeVar = tyoVar;
        }
        K(wkzVarA.a());
        return toeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [wmk] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [afuu] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [afuu] */
    /* JADX WARN: Type inference failed for: r9v1, types: [afuu] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tmn, defpackage.tns
    public final ListenableFuture j(Executor executor, tnm tnmVar, boolean z) throws IOException {
        Throwable th;
        ?? r1;
        Throwable th2;
        ListenableFuture listenableFutureU;
        ListenableFuture aherVar;
        ?? r2;
        List listSingletonList;
        int i = 1;
        wkw wkwVar = new wkw(this, i);
        int iB = b();
        boolean z2 = this.s.c;
        executor.getClass();
        tnmVar.getClass();
        taq.c();
        ?? D = this.r;
        long jA = D.a(wkwVar);
        afuy afuyVar = afux.a;
        D = afwt.d(80, "parseNetworkResponseAsync", afuyVar, true);
        try {
            try {
                dov dovVar = D.k;
                zwa zwaVar = D.e.u;
                Class<?> cls = D.f.getClass();
                aigm aigmVarB = tnmVar.b();
                afuu afuuVarD = afwt.d(77, "processFutAsync", afuyVar, true);
                try {
                    albe albeVarY = dov.Y(aigmVarB, cls);
                    if (albeVarY == null) {
                        try {
                            listenableFutureU = aher.a;
                            try {
                                afuuVarD.close();
                            } catch (Throwable th3) {
                                th = th3;
                                r1 = D;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    try {
                                        r1.close();
                                        throw th4;
                                    } catch (Throwable th5) {
                                        avkz.d(th, th5);
                                        throw th4;
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            try {
                                afuuVarD.close();
                                throw th2;
                            } catch (Throwable th7) {
                                th2.addSuppressed(th7);
                                throw th2;
                            }
                        }
                    } else {
                        listenableFutureU = dovVar.U(executor, zwaVar, albeVarY);
                        afuuVarD.a(listenableFutureU);
                        afuuVarD.close();
                    }
                    ListenableFuture listenableFuture = listenableFutureU;
                    try {
                        afuu afuuVarD2 = afwt.d(81, "parseResponseProto", afux.a, true);
                        try {
                            wlz wlzVarC = D.c(tnmVar, tnmVar.b(), D.f, D.g, wkwVar);
                            afuuVarD2.close();
                            List listE = D.e(executor, wlzVarC.a, D.e.u);
                            if (listE.isEmpty()) {
                                listSingletonList = Collections.singletonList(listenableFuture);
                                listSingletonList.getClass();
                            } else {
                                ArrayList arrayList = new ArrayList(listE.size() + 1);
                                arrayList.add(listenableFuture);
                                arrayList.addAll(listE);
                                listSingletonList = arrayList;
                            }
                            awno awnoVar = awno.a;
                            ?? r3 = D;
                            aherVar = D.d(listSingletonList, jA, tnmVar, this, wkwVar, z, iB, z2, wlzVarC, awnoVar, awnoVar, awnoVar, false, new xea(i));
                            r3.a(aherVar);
                            r2 = r3;
                        } catch (Throwable th8) {
                            try {
                                throw th8;
                            } catch (Throwable th9) {
                                try {
                                    afuuVarD2.close();
                                    throw th9;
                                } catch (Throwable th10) {
                                    try {
                                        avkz.d(th8, th10);
                                        throw th9;
                                    } catch (aiik e) {
                                        e = e;
                                        twu.d(twu.a, 6, "Failed while attempting to deserialize network response", e);
                                        aherVar = new aher(tnx.d(new tnp(e)));
                                        r2 = D;
                                        r2.close();
                                        return aherVar;
                                    }
                                }
                            }
                        }
                    } catch (aiik e2) {
                        e = e2;
                    }
                    r2.close();
                    return aherVar;
                } catch (Throwable th11) {
                    th2 = th11;
                }
            } catch (Throwable th12) {
                th = th12;
                th = th;
                r1 = D;
                throw th;
            }
        } catch (Throwable th13) {
            th = th13;
            D = D;
            th = th;
            r1 = D;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0055  */
    /* JADX WARN: Code duplicated, block: B:126:0x034a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0359 A[Catch: all -> 0x0687, IOException -> 0x06ff, TRY_LEAVE, TryCatch #13 {IOException -> 0x06ff, blocks: (B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:172:0x0434, B:174:0x0438, B:177:0x0445, B:180:0x044c, B:131:0x035c, B:135:0x0368, B:137:0x0380, B:140:0x0388, B:141:0x038e, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:408:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0368 A[Catch: all -> 0x06fb, IOException -> 0x06ff, TRY_LEAVE, TryCatch #13 {IOException -> 0x06ff, blocks: (B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:172:0x0434, B:174:0x0438, B:177:0x0445, B:180:0x044c, B:131:0x035c, B:135:0x0368, B:137:0x0380, B:140:0x0388, B:141:0x038e, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:408:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0380 A[Catch: all -> 0x0687, IOException -> 0x06ff, TRY_ENTER, TRY_LEAVE, TryCatch #13 {IOException -> 0x06ff, blocks: (B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:172:0x0434, B:174:0x0438, B:177:0x0445, B:180:0x044c, B:131:0x035c, B:135:0x0368, B:137:0x0380, B:140:0x0388, B:141:0x038e, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:408:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0387  */
    /* JADX WARN: Code duplicated, block: B:143:0x0394 A[Catch: all -> 0x0687, IOException -> 0x06ff, TRY_ENTER, TryCatch #13 {IOException -> 0x06ff, blocks: (B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:172:0x0434, B:174:0x0438, B:177:0x0445, B:180:0x044c, B:131:0x035c, B:135:0x0368, B:137:0x0380, B:140:0x0388, B:141:0x038e, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:408:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03a2 A[Catch: all -> 0x0687, IOException -> 0x06ff, TryCatch #13 {IOException -> 0x06ff, blocks: (B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:172:0x0434, B:174:0x0438, B:177:0x0445, B:180:0x044c, B:131:0x035c, B:135:0x0368, B:137:0x0380, B:140:0x0388, B:141:0x038e, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:408:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0421 A[Catch: all -> 0x0687, IOException -> 0x06ff, TRY_LEAVE, TryCatch #13 {IOException -> 0x06ff, blocks: (B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:172:0x0434, B:174:0x0438, B:177:0x0445, B:180:0x044c, B:131:0x035c, B:135:0x0368, B:137:0x0380, B:140:0x0388, B:141:0x038e, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:408:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0438 A[Catch: all -> 0x0687, IOException -> 0x06ff, TRY_ENTER, TryCatch #13 {IOException -> 0x06ff, blocks: (B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:172:0x0434, B:174:0x0438, B:177:0x0445, B:180:0x044c, B:131:0x035c, B:135:0x0368, B:137:0x0380, B:140:0x0388, B:141:0x038e, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:408:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0441  */
    /* JADX WARN: Code duplicated, block: B:177:0x0445 A[Catch: all -> 0x0687, IOException -> 0x06ff, TRY_LEAVE, TryCatch #13 {IOException -> 0x06ff, blocks: (B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:172:0x0434, B:174:0x0438, B:177:0x0445, B:180:0x044c, B:131:0x035c, B:135:0x0368, B:137:0x0380, B:140:0x0388, B:141:0x038e, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:408:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x044a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0457 A[Catch: all -> 0x06c7, aiik -> 0x06cd, TRY_LEAVE, TryCatch #5 {aiik -> 0x06cd, blocks: (B:182:0x0451, B:184:0x0457, B:190:0x0468, B:198:0x04a5, B:220:0x04e2, B:222:0x04ed, B:224:0x04f1, B:204:0x04ad, B:205:0x04b0, B:206:0x04b1, B:208:0x04bf, B:210:0x04d2, B:216:0x04db, B:217:0x04de), top: B:398:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0460  */
    /* JADX WARN: Code duplicated, block: B:190:0x0468 A[Catch: all -> 0x06c7, aiik -> 0x06cd, TRY_ENTER, TRY_LEAVE, TryCatch #5 {aiik -> 0x06cd, blocks: (B:182:0x0451, B:184:0x0457, B:190:0x0468, B:198:0x04a5, B:220:0x04e2, B:222:0x04ed, B:224:0x04f1, B:204:0x04ad, B:205:0x04b0, B:206:0x04b1, B:208:0x04bf, B:210:0x04d2, B:216:0x04db, B:217:0x04de), top: B:398:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0486 A[Catch: all -> 0x04a9, TryCatch #2 {all -> 0x04a9, blocks: (B:192:0x0478, B:194:0x0486, B:197:0x04a2, B:196:0x048f), top: B:393:0x0478 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x048f A[Catch: all -> 0x04a9, TryCatch #2 {all -> 0x04a9, blocks: (B:192:0x0478, B:194:0x0486, B:197:0x04a2, B:196:0x048f), top: B:393:0x0478 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x04b1 A[Catch: all -> 0x06c7, aiik -> 0x06cd, TryCatch #5 {aiik -> 0x06cd, blocks: (B:182:0x0451, B:184:0x0457, B:190:0x0468, B:198:0x04a5, B:220:0x04e2, B:222:0x04ed, B:224:0x04f1, B:204:0x04ad, B:205:0x04b0, B:206:0x04b1, B:208:0x04bf, B:210:0x04d2, B:216:0x04db, B:217:0x04de), top: B:398:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x04bf A[Catch: all -> 0x06c7, aiik -> 0x06cd, TRY_LEAVE, TryCatch #5 {aiik -> 0x06cd, blocks: (B:182:0x0451, B:184:0x0457, B:190:0x0468, B:198:0x04a5, B:220:0x04e2, B:222:0x04ed, B:224:0x04f1, B:204:0x04ad, B:205:0x04b0, B:206:0x04b1, B:208:0x04bf, B:210:0x04d2, B:216:0x04db, B:217:0x04de), top: B:398:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x04df  */
    /* JADX WARN: Code duplicated, block: B:220:0x04e2 A[Catch: all -> 0x06c7, aiik -> 0x06cd, TryCatch #5 {aiik -> 0x06cd, blocks: (B:182:0x0451, B:184:0x0457, B:190:0x0468, B:198:0x04a5, B:220:0x04e2, B:222:0x04ed, B:224:0x04f1, B:204:0x04ad, B:205:0x04b0, B:206:0x04b1, B:208:0x04bf, B:210:0x04d2, B:216:0x04db, B:217:0x04de), top: B:398:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:224:0x04f1 A[Catch: all -> 0x06c7, aiik -> 0x06cd, TRY_LEAVE, TryCatch #5 {aiik -> 0x06cd, blocks: (B:182:0x0451, B:184:0x0457, B:190:0x0468, B:198:0x04a5, B:220:0x04e2, B:222:0x04ed, B:224:0x04f1, B:204:0x04ad, B:205:0x04b0, B:206:0x04b1, B:208:0x04bf, B:210:0x04d2, B:216:0x04db, B:217:0x04de), top: B:398:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x050d A[Catch: aiik -> 0x0611, all -> 0x06c7, TryCatch #0 {aiik -> 0x0611, blocks: (B:226:0x04fe, B:227:0x0507, B:229:0x050d, B:231:0x051b, B:263:0x0566, B:270:0x0575), top: B:389:0x04fe }] */
    /* JADX WARN: Code duplicated, block: B:231:0x051b A[Catch: aiik -> 0x0611, all -> 0x06c7, TRY_LEAVE, TryCatch #0 {aiik -> 0x0611, blocks: (B:226:0x04fe, B:227:0x0507, B:229:0x050d, B:231:0x051b, B:263:0x0566, B:270:0x0575), top: B:389:0x04fe }] */
    /* JADX WARN: Code duplicated, block: B:234:0x0520 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x0522  */
    /* JADX WARN: Code duplicated, block: B:237:0x0525 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x0527  */
    /* JADX WARN: Code duplicated, block: B:239:0x052a  */
    /* JADX WARN: Code duplicated, block: B:240:0x052c  */
    /* JADX WARN: Code duplicated, block: B:241:0x052e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0530  */
    /* JADX WARN: Code duplicated, block: B:244:0x0533  */
    /* JADX WARN: Code duplicated, block: B:248:0x053a  */
    /* JADX WARN: Code duplicated, block: B:250:0x053d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0546  */
    /* JADX WARN: Code duplicated, block: B:257:0x0552  */
    /* JADX WARN: Code duplicated, block: B:259:0x0556 A[Catch: aiik -> 0x056d, all -> 0x06c7, TRY_LEAVE, TryCatch #20 {all -> 0x06c7, blocks: (B:182:0x0451, B:184:0x0457, B:190:0x0468, B:198:0x04a5, B:220:0x04e2, B:222:0x04ed, B:224:0x04f1, B:226:0x04fe, B:227:0x0507, B:229:0x050d, B:231:0x051b, B:252:0x0540, B:253:0x0545, B:256:0x0549, B:259:0x0556, B:263:0x0566, B:265:0x056a, B:270:0x0575, B:204:0x04ad, B:205:0x04b0, B:206:0x04b1, B:208:0x04bf, B:210:0x04d2, B:216:0x04db, B:217:0x04de), top: B:398:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0566 A[Catch: aiik -> 0x0611, all -> 0x06c7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {aiik -> 0x0611, blocks: (B:226:0x04fe, B:227:0x0507, B:229:0x050d, B:231:0x051b, B:263:0x0566, B:270:0x0575), top: B:389:0x04fe }] */
    /* JADX WARN: Code duplicated, block: B:265:0x056a A[Catch: aiik -> 0x056d, all -> 0x06c7, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x06c7, blocks: (B:182:0x0451, B:184:0x0457, B:190:0x0468, B:198:0x04a5, B:220:0x04e2, B:222:0x04ed, B:224:0x04f1, B:226:0x04fe, B:227:0x0507, B:229:0x050d, B:231:0x051b, B:252:0x0540, B:253:0x0545, B:256:0x0549, B:259:0x0556, B:263:0x0566, B:265:0x056a, B:270:0x0575, B:204:0x04ad, B:205:0x04b0, B:206:0x04b1, B:208:0x04bf, B:210:0x04d2, B:216:0x04db, B:217:0x04de), top: B:398:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096 A[Catch: all -> 0x0240, IOException -> 0x0702, TRY_ENTER, TryCatch #12 {IOException -> 0x0702, blocks: (B:4:0x0040, B:7:0x004c, B:11:0x0057, B:14:0x006b, B:16:0x006f, B:23:0x0085, B:24:0x0090, B:26:0x0096, B:32:0x00aa, B:33:0x00ae, B:35:0x00b4, B:38:0x00dd, B:36:0x00c2, B:40:0x00f6, B:41:0x010e, B:43:0x0114, B:47:0x0127, B:48:0x0154, B:50:0x0160, B:54:0x016b, B:56:0x0189, B:58:0x018f, B:62:0x01c3, B:59:0x01b2, B:61:0x01be, B:63:0x01ef, B:64:0x01f6, B:65:0x01f7, B:66:0x01fe, B:82:0x0239), top: B:407:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x05a4 A[Catch: all -> 0x06c2, aiik -> 0x06c4, TryCatch #19 {all -> 0x06c2, blocks: (B:272:0x058b, B:274:0x05a4, B:275:0x05a6, B:279:0x05b1, B:281:0x05bb, B:282:0x05c7, B:284:0x05d0, B:286:0x05d7, B:288:0x05db, B:289:0x05dd, B:285:0x05d5, B:293:0x0604, B:301:0x061c, B:317:0x065d), top: B:418:0x058b }] */
    /* JADX WARN: Code duplicated, block: B:277:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:278:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:281:0x05bb A[Catch: all -> 0x06c2, aiik -> 0x06c4, TryCatch #19 {all -> 0x06c2, blocks: (B:272:0x058b, B:274:0x05a4, B:275:0x05a6, B:279:0x05b1, B:281:0x05bb, B:282:0x05c7, B:284:0x05d0, B:286:0x05d7, B:288:0x05db, B:289:0x05dd, B:285:0x05d5, B:293:0x0604, B:301:0x061c, B:317:0x065d), top: B:418:0x058b }] */
    /* JADX WARN: Code duplicated, block: B:284:0x05d0 A[Catch: all -> 0x06c2, aiik -> 0x06c4, TryCatch #19 {all -> 0x06c2, blocks: (B:272:0x058b, B:274:0x05a4, B:275:0x05a6, B:279:0x05b1, B:281:0x05bb, B:282:0x05c7, B:284:0x05d0, B:286:0x05d7, B:288:0x05db, B:289:0x05dd, B:285:0x05d5, B:293:0x0604, B:301:0x061c, B:317:0x065d), top: B:418:0x058b }] */
    /* JADX WARN: Code duplicated, block: B:285:0x05d5 A[Catch: all -> 0x06c2, aiik -> 0x06c4, TryCatch #19 {all -> 0x06c2, blocks: (B:272:0x058b, B:274:0x05a4, B:275:0x05a6, B:279:0x05b1, B:281:0x05bb, B:282:0x05c7, B:284:0x05d0, B:286:0x05d7, B:288:0x05db, B:289:0x05dd, B:285:0x05d5, B:293:0x0604, B:301:0x061c, B:317:0x065d), top: B:418:0x058b }] */
    /* JADX WARN: Code duplicated, block: B:288:0x05db A[Catch: all -> 0x06c2, aiik -> 0x06c4, TryCatch #19 {all -> 0x06c2, blocks: (B:272:0x058b, B:274:0x05a4, B:275:0x05a6, B:279:0x05b1, B:281:0x05bb, B:282:0x05c7, B:284:0x05d0, B:286:0x05d7, B:288:0x05db, B:289:0x05dd, B:285:0x05d5, B:293:0x0604, B:301:0x061c, B:317:0x065d), top: B:418:0x058b }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:291:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:296:0x060a A[PHI: r6 r14 r37
      0x060a: PHI (r6v15 wmn) = (r6v13 wmn), (r6v19 wmn) binds: [B:223:0x04ef, B:295:0x0608] A[DONT_GENERATE, DONT_INLINE]
      0x060a: PHI (r14v18 java.lang.Throwable) = (r14v17 java.lang.Throwable), (r14v21 java.lang.Throwable) binds: [B:223:0x04ef, B:295:0x0608] A[DONT_GENERATE, DONT_INLINE]
      0x060a: PHI (r37v12 awrm) = (r37v9 awrm), (r37v14 awrm) binds: [B:223:0x04ef, B:295:0x0608] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:304:0x062c A[Catch: all -> 0x063c, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x063c, blocks: (B:304:0x062c, B:308:0x0637), top: B:415:0x062a }] */
    /* JADX WARN: Code duplicated, block: B:306:0x0631 A[Catch: all -> 0x06b4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x06b4, blocks: (B:302:0x0624, B:313:0x0648, B:306:0x0631, B:312:0x0644), top: B:404:0x0624 }] */
    /* JADX WARN: Code duplicated, block: B:308:0x0637 A[Catch: all -> 0x063c, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x063c, blocks: (B:304:0x062c, B:308:0x0637), top: B:415:0x062a }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0644 A[Catch: all -> 0x06b4, TRY_ENTER, TryCatch #9 {all -> 0x06b4, blocks: (B:302:0x0624, B:313:0x0648, B:306:0x0631, B:312:0x0644), top: B:404:0x0624 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x066f A[Catch: all -> 0x0687, TRY_ENTER, TryCatch #21 {all -> 0x0687, blocks: (B:102:0x029c, B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:174:0x0438, B:177:0x0445, B:320:0x066f, B:322:0x0675, B:329:0x0684, B:137:0x0380, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:391:0x029c }] */
    /* JADX WARN: Code duplicated, block: B:322:0x0675 A[Catch: all -> 0x0687, TRY_LEAVE, TryCatch #21 {all -> 0x0687, blocks: (B:102:0x029c, B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:174:0x0438, B:177:0x0445, B:320:0x066f, B:322:0x0675, B:329:0x0684, B:137:0x0380, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:391:0x029c }] */
    /* JADX WARN: Code duplicated, block: B:324:0x0678  */
    /* JADX WARN: Code duplicated, block: B:325:0x067a A[Catch: all -> 0x06fb, TRY_ENTER, TryCatch #16 {all -> 0x06fb, blocks: (B:172:0x0434, B:180:0x044c, B:318:0x0660, B:327:0x067e, B:334:0x068b, B:325:0x067a, B:131:0x035c, B:135:0x0368, B:140:0x0388, B:141:0x038e), top: B:412:0x035c }] */
    /* JADX WARN: Code duplicated, block: B:329:0x0684 A[Catch: all -> 0x0687, TRY_ENTER, TRY_LEAVE, TryCatch #21 {all -> 0x0687, blocks: (B:102:0x029c, B:104:0x02a2, B:106:0x02a8, B:108:0x02af, B:112:0x02be, B:115:0x02d2, B:117:0x02d8, B:129:0x0359, B:174:0x0438, B:177:0x0445, B:320:0x066f, B:322:0x0675, B:329:0x0684, B:137:0x0380, B:143:0x0394, B:145:0x03a2, B:147:0x03a8, B:148:0x03ba, B:150:0x03c0, B:152:0x03c8, B:154:0x03ce, B:156:0x03d6, B:158:0x03da, B:159:0x03e1, B:161:0x03e9, B:163:0x03fd, B:165:0x0401, B:166:0x0404, B:169:0x0421), top: B:391:0x029c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[Catch: all -> 0x0240, IOException -> 0x0702, TryCatch #12 {IOException -> 0x0702, blocks: (B:4:0x0040, B:7:0x004c, B:11:0x0057, B:14:0x006b, B:16:0x006f, B:23:0x0085, B:24:0x0090, B:26:0x0096, B:32:0x00aa, B:33:0x00ae, B:35:0x00b4, B:38:0x00dd, B:36:0x00c2, B:40:0x00f6, B:41:0x010e, B:43:0x0114, B:47:0x0127, B:48:0x0154, B:50:0x0160, B:54:0x016b, B:56:0x0189, B:58:0x018f, B:62:0x01c3, B:59:0x01b2, B:61:0x01be, B:63:0x01ef, B:64:0x01f6, B:65:0x01f7, B:66:0x01fe, B:82:0x0239), top: B:407:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae A[Catch: all -> 0x0240, IOException -> 0x0702, TryCatch #12 {IOException -> 0x0702, blocks: (B:4:0x0040, B:7:0x004c, B:11:0x0057, B:14:0x006b, B:16:0x006f, B:23:0x0085, B:24:0x0090, B:26:0x0096, B:32:0x00aa, B:33:0x00ae, B:35:0x00b4, B:38:0x00dd, B:36:0x00c2, B:40:0x00f6, B:41:0x010e, B:43:0x0114, B:47:0x0127, B:48:0x0154, B:50:0x0160, B:54:0x016b, B:56:0x0189, B:58:0x018f, B:62:0x01c3, B:59:0x01b2, B:61:0x01be, B:63:0x01ef, B:64:0x01f6, B:65:0x01f7, B:66:0x01fe, B:82:0x0239), top: B:407:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: all -> 0x0240, IOException -> 0x0702, TryCatch #12 {IOException -> 0x0702, blocks: (B:4:0x0040, B:7:0x004c, B:11:0x0057, B:14:0x006b, B:16:0x006f, B:23:0x0085, B:24:0x0090, B:26:0x0096, B:32:0x00aa, B:33:0x00ae, B:35:0x00b4, B:38:0x00dd, B:36:0x00c2, B:40:0x00f6, B:41:0x010e, B:43:0x0114, B:47:0x0127, B:48:0x0154, B:50:0x0160, B:54:0x016b, B:56:0x0189, B:58:0x018f, B:62:0x01c3, B:59:0x01b2, B:61:0x01be, B:63:0x01ef, B:64:0x01f6, B:65:0x01f7, B:66:0x01fe, B:82:0x0239), top: B:407:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:362:0x06e7 A[Catch: all -> 0x06f6, TryCatch #10 {all -> 0x06f6, blocks: (B:360:0x06d0, B:362:0x06e7, B:363:0x06e9, B:347:0x06bc, B:348:0x06bf), top: B:406:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2 A[Catch: all -> 0x0240, IOException -> 0x0702, TryCatch #12 {IOException -> 0x0702, blocks: (B:4:0x0040, B:7:0x004c, B:11:0x0057, B:14:0x006b, B:16:0x006f, B:23:0x0085, B:24:0x0090, B:26:0x0096, B:32:0x00aa, B:33:0x00ae, B:35:0x00b4, B:38:0x00dd, B:36:0x00c2, B:40:0x00f6, B:41:0x010e, B:43:0x0114, B:47:0x0127, B:48:0x0154, B:50:0x0160, B:54:0x016b, B:56:0x0189, B:58:0x018f, B:62:0x01c3, B:59:0x01b2, B:61:0x01be, B:63:0x01ef, B:64:0x01f6, B:65:0x01f7, B:66:0x01fe, B:82:0x0239), top: B:407:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:376:0x071c A[Catch: all -> 0x072c, TryCatch #4 {all -> 0x072c, blocks: (B:364:0x06f2, B:366:0x06f7, B:367:0x06fa, B:336:0x06a4, B:374:0x0705, B:376:0x071c, B:377:0x071e), top: B:397:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd A[Catch: all -> 0x0240, IOException -> 0x0702, TryCatch #12 {IOException -> 0x0702, blocks: (B:4:0x0040, B:7:0x004c, B:11:0x0057, B:14:0x006b, B:16:0x006f, B:23:0x0085, B:24:0x0090, B:26:0x0096, B:32:0x00aa, B:33:0x00ae, B:35:0x00b4, B:38:0x00dd, B:36:0x00c2, B:40:0x00f6, B:41:0x010e, B:43:0x0114, B:47:0x0127, B:48:0x0154, B:50:0x0160, B:54:0x016b, B:56:0x0189, B:58:0x018f, B:62:0x01c3, B:59:0x01b2, B:61:0x01be, B:63:0x01ef, B:64:0x01f6, B:65:0x01f7, B:66:0x01fe, B:82:0x0239), top: B:407:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x035c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0549 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0211 A[EDGE_INSN: B:433:0x0211->B:69:0x0211 BREAK  A[LOOP:0: B:24:0x0090->B:438:0x0090], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0114 A[Catch: all -> 0x0240, IOException -> 0x0702, TryCatch #12 {IOException -> 0x0702, blocks: (B:4:0x0040, B:7:0x004c, B:11:0x0057, B:14:0x006b, B:16:0x006f, B:23:0x0085, B:24:0x0090, B:26:0x0096, B:32:0x00aa, B:33:0x00ae, B:35:0x00b4, B:38:0x00dd, B:36:0x00c2, B:40:0x00f6, B:41:0x010e, B:43:0x0114, B:47:0x0127, B:48:0x0154, B:50:0x0160, B:54:0x016b, B:56:0x0189, B:58:0x018f, B:62:0x01c3, B:59:0x01b2, B:61:0x01be, B:63:0x01ef, B:64:0x01f6, B:65:0x01f7, B:66:0x01fe, B:82:0x0239), top: B:407:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:441:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x0160 A[EDGE_INSN: B:442:0x0160->B:50:0x0160 BREAK  A[LOOP:1: B:41:0x010e->B:445:0x010e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0600 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x0562 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0537 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0259  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [wmk] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, wmo] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tmn, defpackage.tns
    public final ListenableFuture k(Executor executor, tnm tnmVar, boolean z) {
        Throwable th;
        ?? r1;
        awrm awrmVar;
        afuu afuuVar;
        List list;
        ListenableFuture listenableFutureN;
        boolean z2;
        char c;
        ArrayList arrayList;
        apkt apktVar;
        albe albeVar;
        Iterable iterableJ;
        wkw wkwVar;
        int i;
        awrm awrmVar2;
        wmk wmkVar;
        boolean z3;
        ArrayList arrayList2;
        xpl xplVar;
        long j;
        ArrayList arrayList3;
        Iterator it;
        wmm wmmVar;
        long j2;
        ?? r25;
        Iterator it2;
        ByteBuffer byteBuffer;
        wmn wmnVar;
        hho hhoVar;
        ?? r30;
        wmn wmnVar2;
        awrm awrmVar3;
        List list2;
        Iterable iterable;
        boolean z4;
        wmk wmkVar2;
        int i2;
        Throwable th2;
        int i3;
        albe albeVarA;
        ListenableFuture listenableFuture;
        afuu afuuVarC;
        ?? r10;
        apkt apktVar2;
        afuu afuuVarC2;
        Throwable th3;
        wmo wmoVar;
        aigm aigmVarT;
        List listE;
        ?? r3;
        List list3;
        ?? r11;
        uwk uwkVar;
        uwk uwkVar2;
        awrm awrmVar4;
        int i4;
        int i5;
        int i6;
        int i7;
        ?? BooleanValue;
        ajnv ajnvVar;
        Map map;
        tms tmsVarA;
        int i8;
        ajeg ajegVar;
        aifv aifvVar;
        xxj xxjVar;
        afuu afuuVarC3;
        dov dovVar;
        zwa zwaVar;
        ListenableFuture listenableFutureAq;
        ?? r0;
        int iE;
        int iN;
        int iK;
        int iK2;
        long jE;
        long j3;
        long jE2;
        aigs aigpVar;
        long jE3;
        int iN2;
        char c2 = 1;
        wkw wkwVar2 = new wkw(this, c2);
        wls wlsVar = this.s;
        int iB = b();
        boolean z5 = wlsVar.c;
        executor.getClass();
        tnmVar.getClass();
        taq.c();
        wmk wmkVar3 = this.r;
        long jA = wmkVar3.a(wkwVar2);
        Object obj = "parseNetworkResponseAsync";
        afuu afuuVarC4 = afwt.c(83, "parseNetworkResponseAsync");
        try {
            try {
                ?? C = tnmVar.c();
                C.getClass();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                awrm awrmVar5 = new awrm();
                try {
                    try {
                        ?? r4 = wmkVar3.a;
                        boolean z6 = wmkVar3.h;
                        if (r4.c()) {
                            try {
                                if (tnmVar.d()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r1 = afuuVarC4;
                            }
                        } else {
                            z2 = false;
                        }
                        aigm aigmVarA = r4.a(C);
                        tqj tqjVar = r4.b;
                        int i9 = tqr.a;
                        if (tqjVar.k(1073815717)) {
                            int iSysconf = r4.c;
                            if (iSysconf == 0) {
                                iSysconf = (int) Os.sysconf(OsConstants._SC_NPROCESSORS_ONLN);
                                r4.c = iSysconf;
                            }
                            c = iSysconf > 4 ? c2 : (char) 0;
                            arrayList = new ArrayList();
                            apktVar = null;
                            albeVar = null;
                            iterableJ = null;
                            while (!aigmVarA.D()) {
                                iE = aigmVarA.e();
                                iN = aigmVarA.n();
                                if (iN != 0) {
                                    break;
                                }
                                c = c;
                                if (iN != 10) {
                                    long j4 = iE;
                                    iK2 = aigmVarA.k();
                                    jE = aigmVarA.e();
                                    int iF = aigmVarA.f(iK2);
                                    j3 = -1;
                                    jE2 = -1;
                                    apktVar = null;
                                    while (true) {
                                        if (!aigmVarA.D()) {
                                            jE = jE;
                                            break;
                                        }
                                        jE = jE;
                                        jE3 = aigmVarA.e();
                                        iN2 = aigmVarA.n();
                                        if (iN2 != 0) {
                                            break;
                                        }
                                        if (iN2 == 258) {
                                            int iF2 = aigmVarA.f(aigmVarA.k());
                                            apkt apktVar3 = apkt.a;
                                            apktVar = (apkt) aihn.getParserForClass(apkt.class).f(aigmVarA, wmo.a);
                                            aigmVarA.A(iF2);
                                            jE2 = aigmVarA.e();
                                            iK2 = iK2;
                                            j3 = jE3;
                                        } else {
                                            aigmVarA.F(iN2);
                                            iK2 = iK2;
                                        }
                                    }
                                    int i10 = iK2;
                                    aigmVarA.A(iF);
                                    if (apktVar != null || j3 == -1) {
                                        aigmVarA = aigmVarA;
                                        wkwVar2 = wkwVar2;
                                        iB = iB;
                                    } else {
                                        int i11 = i10 - ((int) (jE2 - j3));
                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(c2 + ((352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6));
                                        byteBufferAllocate.getClass();
                                        if (byteBufferAllocate.isReadOnly()) {
                                            throw new IllegalArgumentException("ByteBuffer is read-only");
                                        }
                                        if (byteBufferAllocate.hasArray()) {
                                            aigpVar = new aigo(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset() + byteBufferAllocate.position(), byteBufferAllocate.remaining(), new aami(byteBufferAllocate));
                                        } else {
                                            if (!byteBufferAllocate.isDirect()) {
                                                throw new IllegalArgumentException("ByteBuffer mut be either direct or array");
                                            }
                                            aigpVar = new aigp(byteBufferAllocate);
                                        }
                                        aigpVar.w(c2, 2);
                                        aigpVar.y(i11);
                                        aigpVar.d();
                                        byteBufferAllocate.flip();
                                        arrayList.add(new wmm(j4, jE, byteBufferAllocate));
                                        arrayList.add(new wmm(j3, jE2, null));
                                    }
                                    aigmVarA = aigmVarA;
                                    wkwVar2 = wkwVar2;
                                    iB = iB;
                                    c2 = 1;
                                } else if (iN != 6218) {
                                    aigmVarA.F(iN);
                                } else {
                                    iK = aigmVarA.k();
                                    if (c != 0) {
                                        int iE2 = aigmVarA.e();
                                        aigmVarA.C(iK);
                                        iterableJ = nsi.j(C, iE2, iK);
                                    } else {
                                        int iF3 = aigmVarA.f(iK);
                                        albe albeVar2 = albe.a;
                                        albe albeVar3 = (albe) aihn.getParserForClass(albe.class).f(aigmVarA, wmo.a);
                                        aigmVarA.A(iF3);
                                        albeVar = albeVar3;
                                    }
                                    if (!z6) {
                                        arrayList.add(new wmm(iE, aigmVarA.e(), null));
                                    }
                                }
                            }
                            wkwVar = wkwVar2;
                            i = iB;
                            if (z2) {
                                wmkVar = wmkVar3;
                                z3 = z5;
                                awrmVar2 = awrmVar5;
                                afuuVar = afuuVarC4;
                                arrayList2 = arrayList5;
                                j = 0;
                                xplVar = null;
                                if (xplVar == null) {
                                    r0 = C;
                                    if (!arrayList.isEmpty()) {
                                        arrayList3 = new ArrayList(C.size() + arrayList.size());
                                        it = arrayList.iterator();
                                        if (it.hasNext()) {
                                            wmmVar = (wmm) it.next();
                                        } else {
                                            wmmVar = null;
                                        }
                                        j2 = j;
                                        for (ByteBuffer byteBuffer2 : C) {
                                            long jRemaining = ((long) byteBuffer2.remaining()) + j2;
                                            if (wmmVar != null) {
                                                it2 = it;
                                                arrayList3.add(byteBuffer2.duplicate());
                                            } else {
                                                it2 = it;
                                                arrayList3.add(byteBuffer2.duplicate());
                                            }
                                            j2 = jRemaining;
                                            it = it2;
                                        }
                                        r25 = arrayList3;
                                    }
                                    if (iterableJ != null) {
                                        hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                    } else {
                                        hhoVar = null;
                                    }
                                    if (xplVar != null) {
                                        r30 = xplVar.a;
                                    } else {
                                        r30 = 0;
                                    }
                                    wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                    wmnVar2 = wmnVar;
                                    iterable = wmnVar2.a;
                                    if (wmnVar2.d == null) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        xxjVar = new xxj(wmnVar2, null);
                                        afuuVarC3 = afwt.c(78, "processFutAsync");
                                        th2 = null;
                                        wmkVar2 = wmkVar;
                                        dovVar = wmkVar2.k;
                                        zwaVar = wmkVar2.e.u;
                                        if (dovVar.a.isEmpty()) {
                                            listenableFutureAq = aher.a;
                                            i2 = 2;
                                            i3 = 0;
                                        } else {
                                            i2 = 2;
                                            i3 = 0;
                                            listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                        }
                                        listenableFuture = listenableFutureAq;
                                        afuuVarC3.a(listenableFuture);
                                        JniZero.l(afuuVarC3, th2);
                                    } else {
                                        wmkVar2 = wmkVar;
                                        i2 = 2;
                                        th2 = null;
                                        i3 = 0;
                                        albeVarA = wmnVar2.a();
                                        if (albeVarA != null) {
                                            afuuVarC = afwt.c(79, "processFutAsync");
                                            ListenableFuture listenableFutureU = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                            afuuVarC.a(listenableFutureU);
                                            JniZero.l(afuuVarC, null);
                                            listenableFuture = listenableFutureU;
                                        } else {
                                            listenableFuture = null;
                                        }
                                    }
                                    if (listenableFuture != null) {
                                        ArrayList arrayList6 = new ArrayList();
                                        arrayList6.add(listenableFuture);
                                        r10 = arrayList6;
                                    } else {
                                        r10 = th2;
                                    }
                                    apktVar2 = wmnVar2.b;
                                    if (apktVar2 != null) {
                                        uwkVar = new uwk(arrayList4, 16);
                                        awrmVar4 = awrmVar2;
                                        uwkVar2 = new uwk(awrmVar4, 17);
                                        for (apks apksVar : apktVar2.b) {
                                            th2 = th2;
                                            i4 = apksVar.b;
                                            if ((i4 & 1) != 0) {
                                                i5 = apksVar.c;
                                                if (i5 != 0) {
                                                    i6 = 4;
                                                } else if (i5 != i2) {
                                                    i6 = 1;
                                                } else if (i5 != 4) {
                                                    i6 = 2;
                                                } else if (i5 != 5) {
                                                    i6 = i3;
                                                } else {
                                                    i6 = 3;
                                                }
                                                if (i6 != 0) {
                                                    throw th2;
                                                }
                                                i7 = i6 - 1;
                                                if (i7 != 0) {
                                                    if (i7 != 1) {
                                                        if (i7 != 2) {
                                                            if (i5 == 5) {
                                                                BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                            } else {
                                                                BooleanValue = i3;
                                                            }
                                                            if (BooleanValue != 0) {
                                                                String str = apksVar.e;
                                                                str.getClass();
                                                                uwkVar2.invoke(str);
                                                            }
                                                        } else if (i7 != 3) {
                                                            throw new awmj();
                                                        }
                                                    }
                                                    th2 = th2;
                                                    i2 = 2;
                                                } else if ((i4 & 2) != 0) {
                                                    ajnvVar = apksVar.f;
                                                    if (ajnvVar == null) {
                                                        ajnvVar = ajnv.a;
                                                    }
                                                    ajnvVar.getClass();
                                                    map = tnmVar.e;
                                                    uwk uwkVar3 = uwkVar2;
                                                    awrmVar2 = awrmVar4;
                                                    wmnVar = wmnVar2;
                                                    long epochMilli = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                    tmsVarA = tmt.a();
                                                    tmsVarA.f(epochMilli);
                                                    tmsVarA.g(epochMilli);
                                                    tmsVarA.e(j);
                                                    if (map == null) {
                                                        map = agpn.b;
                                                    }
                                                    tmsVarA.d(map);
                                                    if (true != ajnvVar.e) {
                                                        i8 = 1;
                                                    } else {
                                                        i8 = 2;
                                                    }
                                                    tmsVarA.d = i8;
                                                    if ((ajnvVar.b & 4) != 0) {
                                                        tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                    }
                                                    tmt tmtVarA = tmsVarA.a();
                                                    i2 = 2;
                                                    if (apksVar.c == 2) {
                                                        ajegVar = (ajeg) apksVar.d;
                                                    } else {
                                                        ajegVar = ajeg.a;
                                                    }
                                                    aifvVar = ajegVar.b;
                                                    if (aifvVar == null) {
                                                        aifvVar = aifv.a;
                                                    }
                                                    byte[] bArrG = aifvVar.c.G();
                                                    String str2 = apksVar.e;
                                                    str2.getClass();
                                                    uwkVar.invoke(new tne(bArrG, tmtVarA, str2));
                                                    uwkVar2 = uwkVar3;
                                                    wmnVar2 = wmnVar;
                                                    awrmVar4 = awrmVar2;
                                                } else {
                                                    i2 = 2;
                                                }
                                            }
                                            j = 0;
                                        }
                                        awrmVar2 = awrmVar4;
                                        wmnVar = wmnVar2;
                                        Throwable th5 = th2;
                                        afuuVarC2 = afwt.c(84, "parseResponseProto");
                                        wmoVar = wmkVar2.a;
                                        if (wmoVar.c()) {
                                            aigmVarT = wmoVar.a(iterable);
                                        } else {
                                            if (iterable == tnmVar.c()) {
                                                aigmVarT = tnmVar.b();
                                            } else {
                                                aigmVarT = aigm.T(iterable);
                                            }
                                            aigm aigmVar = aigmVarT;
                                            MessageLite messageLite = wmkVar2.f;
                                            zza zzaVar = wmkVar2.g;
                                            final ?? r2 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC = r2.c(tnmVar, aigmVar, messageLite, zzaVar, wkwVar);
                                            JniZero.l(afuuVarC2, th5);
                                            wmnVar.b();
                                            listE = r2.e(executor, wlzVarC.a, r2.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r2.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite2;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite2 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r2.d.a(messageLite2);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r2.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite2;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite2 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r2.d.a(messageLite2);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        }
                                        aigm aigmVar2 = aigmVarT;
                                        MessageLite messageLite2 = wmkVar2.f;
                                        zza zzaVar2 = wmkVar2.g;
                                        final wmk r5 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC2 = r5.c(tnmVar, aigmVar2, messageLite2, zzaVar2, wkwVar);
                                        JniZero.l(afuuVarC2, th5);
                                        wmnVar.b();
                                        listE = r5.e(executor, wlzVarC2.a, r5.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r5.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC2, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite3;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite3 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r5.d.a(messageLite3);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r5.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC2, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite3;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite3 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r5.d.a(messageLite3);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        wmnVar = wmnVar2;
                                        Throwable th6 = th2;
                                        afuuVarC2 = afwt.c(84, "parseResponseProto");
                                        wmoVar = wmkVar2.a;
                                        if (wmoVar.c()) {
                                            aigmVarT = wmoVar.a(iterable);
                                        } else {
                                            if (iterable == tnmVar.c()) {
                                                aigmVarT = tnmVar.b();
                                            } else {
                                                aigmVarT = aigm.T(iterable);
                                            }
                                            aigm aigmVar3 = aigmVarT;
                                            MessageLite messageLite3 = wmkVar2.f;
                                            zza zzaVar3 = wmkVar2.g;
                                            final wmk r6 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC3 = r6.c(tnmVar, aigmVar3, messageLite3, zzaVar3, wkwVar);
                                            JniZero.l(afuuVarC2, th6);
                                            wmnVar.b();
                                            listE = r6.e(executor, wlzVarC3.a, r6.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r6.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC3, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite4;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite4 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r6.d.a(messageLite4);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r6.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC3, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite4;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite4 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r6.d.a(messageLite4);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        }
                                        aigm aigmVar4 = aigmVarT;
                                        MessageLite messageLite4 = wmkVar2.f;
                                        zza zzaVar4 = wmkVar2.g;
                                        final wmk r7 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC4 = r7.c(tnmVar, aigmVar4, messageLite4, zzaVar4, wkwVar);
                                        JniZero.l(afuuVarC2, th6);
                                        wmnVar.b();
                                        listE = r7.e(executor, wlzVarC4.a, r7.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r7.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC4, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite5;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite5 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r7.d.a(messageLite5);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r7.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC4, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite5;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite5 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r7.d.a(messageLite5);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    }
                                    JniZero.l(afuuVar, null);
                                    return listenableFutureN;
                                }
                                r0 = xplVar.b;
                                r25 = r0;
                                if (iterableJ != null) {
                                    hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                } else {
                                    hhoVar = null;
                                }
                                if (xplVar != null) {
                                    r30 = xplVar.a;
                                } else {
                                    r30 = 0;
                                }
                                wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                wmnVar2 = wmnVar;
                                iterable = wmnVar2.a;
                                if (wmnVar2.d == null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    xxjVar = new xxj(wmnVar2, null);
                                    afuuVarC3 = afwt.c(78, "processFutAsync");
                                    th2 = null;
                                    wmkVar2 = wmkVar;
                                    dovVar = wmkVar2.k;
                                    zwaVar = wmkVar2.e.u;
                                    if (dovVar.a.isEmpty()) {
                                        listenableFutureAq = aher.a;
                                        i2 = 2;
                                        i3 = 0;
                                    } else {
                                        i2 = 2;
                                        i3 = 0;
                                        listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                    }
                                    listenableFuture = listenableFutureAq;
                                    afuuVarC3.a(listenableFuture);
                                    JniZero.l(afuuVarC3, th2);
                                } else {
                                    wmkVar2 = wmkVar;
                                    i2 = 2;
                                    th2 = null;
                                    i3 = 0;
                                    albeVarA = wmnVar2.a();
                                    if (albeVarA != null) {
                                        afuuVarC = afwt.c(79, "processFutAsync");
                                        ListenableFuture listenableFutureU2 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                        afuuVarC.a(listenableFutureU2);
                                        JniZero.l(afuuVarC, null);
                                        listenableFuture = listenableFutureU2;
                                    } else {
                                        listenableFuture = null;
                                    }
                                }
                                if (listenableFuture != null) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.add(listenableFuture);
                                    r10 = arrayList7;
                                } else {
                                    r10 = th2;
                                }
                                apktVar2 = wmnVar2.b;
                                if (apktVar2 != null) {
                                    uwkVar = new uwk(arrayList4, 16);
                                    awrmVar4 = awrmVar2;
                                    uwkVar2 = new uwk(awrmVar4, 17);
                                    while (r0.hasNext()) {
                                        th2 = th2;
                                        i4 = apksVar.b;
                                        if ((i4 & 1) != 0) {
                                            i5 = apksVar.c;
                                            if (i5 != 0) {
                                                i6 = 4;
                                            } else if (i5 != i2) {
                                                i6 = 1;
                                            } else if (i5 != 4) {
                                                i6 = 2;
                                            } else if (i5 != 5) {
                                                i6 = i3;
                                            } else {
                                                i6 = 3;
                                            }
                                            if (i6 != 0) {
                                                throw th2;
                                            }
                                            i7 = i6 - 1;
                                            if (i7 != 0) {
                                                if (i7 != 1) {
                                                    if (i7 != 2) {
                                                        if (i5 == 5) {
                                                            BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                        } else {
                                                            BooleanValue = i3;
                                                        }
                                                        if (BooleanValue != 0) {
                                                            String str3 = apksVar.e;
                                                            str3.getClass();
                                                            uwkVar2.invoke(str3);
                                                        }
                                                    } else if (i7 != 3) {
                                                        throw new awmj();
                                                    }
                                                }
                                                th2 = th2;
                                                i2 = 2;
                                            } else if ((i4 & 2) != 0) {
                                                ajnvVar = apksVar.f;
                                                if (ajnvVar == null) {
                                                    ajnvVar = ajnv.a;
                                                }
                                                ajnvVar.getClass();
                                                map = tnmVar.e;
                                                uwk uwkVar4 = uwkVar2;
                                                awrmVar2 = awrmVar4;
                                                wmnVar = wmnVar2;
                                                long epochMilli2 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                tmsVarA = tmt.a();
                                                tmsVarA.f(epochMilli2);
                                                tmsVarA.g(epochMilli2);
                                                tmsVarA.e(j);
                                                if (map == null) {
                                                    map = agpn.b;
                                                }
                                                tmsVarA.d(map);
                                                if (true != ajnvVar.e) {
                                                    i8 = 1;
                                                } else {
                                                    i8 = 2;
                                                }
                                                tmsVarA.d = i8;
                                                if ((ajnvVar.b & 4) != 0) {
                                                    tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                }
                                                tmt tmtVarA2 = tmsVarA.a();
                                                i2 = 2;
                                                if (apksVar.c == 2) {
                                                    ajegVar = (ajeg) apksVar.d;
                                                } else {
                                                    ajegVar = ajeg.a;
                                                }
                                                aifvVar = ajegVar.b;
                                                if (aifvVar == null) {
                                                    aifvVar = aifv.a;
                                                }
                                                byte[] bArrG2 = aifvVar.c.G();
                                                String str4 = apksVar.e;
                                                str4.getClass();
                                                uwkVar.invoke(new tne(bArrG2, tmtVarA2, str4));
                                                uwkVar2 = uwkVar4;
                                                wmnVar2 = wmnVar;
                                                awrmVar4 = awrmVar2;
                                            } else {
                                                i2 = 2;
                                            }
                                        }
                                        j = 0;
                                    }
                                    awrmVar2 = awrmVar4;
                                    wmnVar = wmnVar2;
                                    Throwable th7 = th2;
                                    afuuVarC2 = afwt.c(84, "parseResponseProto");
                                    wmoVar = wmkVar2.a;
                                    if (wmoVar.c()) {
                                        aigmVarT = wmoVar.a(iterable);
                                    } else {
                                        if (iterable == tnmVar.c()) {
                                            aigmVarT = tnmVar.b();
                                        } else {
                                            aigmVarT = aigm.T(iterable);
                                        }
                                        aigm aigmVar5 = aigmVarT;
                                        MessageLite messageLite5 = wmkVar2.f;
                                        zza zzaVar5 = wmkVar2.g;
                                        final wmk r8 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC5 = r8.c(tnmVar, aigmVar5, messageLite5, zzaVar5, wkwVar);
                                        JniZero.l(afuuVarC2, th7);
                                        wmnVar.b();
                                        listE = r8.e(executor, wlzVarC5.a, r8.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r8.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC5, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite6;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite6 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r8.d.a(messageLite6);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r8.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC5, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite6;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite6 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r8.d.a(messageLite6);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    }
                                    aigm aigmVar6 = aigmVarT;
                                    MessageLite messageLite6 = wmkVar2.f;
                                    zza zzaVar6 = wmkVar2.g;
                                    final wmk r9 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC6 = r9.c(tnmVar, aigmVar6, messageLite6, zzaVar6, wkwVar);
                                    JniZero.l(afuuVarC2, th7);
                                    wmnVar.b();
                                    listE = r9.e(executor, wlzVarC6.a, r9.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r9.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC6, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite7;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite7 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r9.d.a(messageLite7);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r9.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC6, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite7;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite7 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r9.d.a(messageLite7);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    wmnVar = wmnVar2;
                                    Throwable th8 = th2;
                                    afuuVarC2 = afwt.c(84, "parseResponseProto");
                                    wmoVar = wmkVar2.a;
                                    if (wmoVar.c()) {
                                        aigmVarT = wmoVar.a(iterable);
                                    } else {
                                        if (iterable == tnmVar.c()) {
                                            aigmVarT = tnmVar.b();
                                        } else {
                                            aigmVarT = aigm.T(iterable);
                                        }
                                        aigm aigmVar7 = aigmVarT;
                                        MessageLite messageLite7 = wmkVar2.f;
                                        zza zzaVar7 = wmkVar2.g;
                                        final wmk r12 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC7 = r12.c(tnmVar, aigmVar7, messageLite7, zzaVar7, wkwVar);
                                        JniZero.l(afuuVarC2, th8);
                                        wmnVar.b();
                                        listE = r12.e(executor, wlzVarC7.a, r12.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r12.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC7, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite8;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite8 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r12.d.a(messageLite8);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r12.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC7, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite8;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite8 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r12.d.a(messageLite8);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    }
                                    aigm aigmVar8 = aigmVarT;
                                    MessageLite messageLite8 = wmkVar2.f;
                                    zza zzaVar8 = wmkVar2.g;
                                    final wmk r13 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC8 = r13.c(tnmVar, aigmVar8, messageLite8, zzaVar8, wkwVar);
                                    JniZero.l(afuuVarC2, th8);
                                    wmnVar.b();
                                    listE = r13.e(executor, wlzVarC8.a, r13.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r13.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC8, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite9;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite9 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r13.d.a(messageLite9);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r13.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC8, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite9;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite9 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r13.d.a(messageLite9);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                }
                                JniZero.l(afuuVar, null);
                                return listenableFutureN;
                            }
                            try {
                                if (arrayList.isEmpty() && r4.c()) {
                                    ByteBuffer byteBuffer3 = (ByteBuffer) atqq.ae(C);
                                    if (byteBuffer3 == null) {
                                        wmkVar = wmkVar3;
                                        z3 = z5;
                                        awrmVar2 = awrmVar5;
                                        afuuVar = afuuVarC4;
                                        arrayList2 = arrayList5;
                                        xplVar = null;
                                        j = 0;
                                        if (xplVar == null) {
                                            r0 = C;
                                            if (!arrayList.isEmpty()) {
                                                arrayList3 = new ArrayList(C.size() + arrayList.size());
                                                it = arrayList.iterator();
                                                if (it.hasNext()) {
                                                    wmmVar = (wmm) it.next();
                                                } else {
                                                    wmmVar = null;
                                                }
                                                j2 = j;
                                                while (r0.hasNext()) {
                                                    long jRemaining2 = ((long) byteBuffer2.remaining()) + j2;
                                                    if (wmmVar != null) {
                                                        it2 = it;
                                                        arrayList3.add(byteBuffer2.duplicate());
                                                    } else {
                                                        it2 = it;
                                                        arrayList3.add(byteBuffer2.duplicate());
                                                    }
                                                    j2 = jRemaining2;
                                                    it = it2;
                                                }
                                                r25 = arrayList3;
                                            }
                                            if (iterableJ != null) {
                                                hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                            } else {
                                                hhoVar = null;
                                            }
                                            if (xplVar != null) {
                                                r30 = xplVar.a;
                                            } else {
                                                r30 = 0;
                                            }
                                            wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                            wmnVar2 = wmnVar;
                                            iterable = wmnVar2.a;
                                            if (wmnVar2.d == null) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            if (z4) {
                                                xxjVar = new xxj(wmnVar2, null);
                                                afuuVarC3 = afwt.c(78, "processFutAsync");
                                                th2 = null;
                                                wmkVar2 = wmkVar;
                                                dovVar = wmkVar2.k;
                                                zwaVar = wmkVar2.e.u;
                                                if (dovVar.a.isEmpty()) {
                                                    listenableFutureAq = aher.a;
                                                    i2 = 2;
                                                    i3 = 0;
                                                } else {
                                                    i2 = 2;
                                                    i3 = 0;
                                                    listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                                }
                                                listenableFuture = listenableFutureAq;
                                                afuuVarC3.a(listenableFuture);
                                                JniZero.l(afuuVarC3, th2);
                                            } else {
                                                wmkVar2 = wmkVar;
                                                i2 = 2;
                                                th2 = null;
                                                i3 = 0;
                                                albeVarA = wmnVar2.a();
                                                if (albeVarA != null) {
                                                    afuuVarC = afwt.c(79, "processFutAsync");
                                                    ListenableFuture listenableFutureU3 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                                    afuuVarC.a(listenableFutureU3);
                                                    JniZero.l(afuuVarC, null);
                                                    listenableFuture = listenableFutureU3;
                                                } else {
                                                    listenableFuture = null;
                                                }
                                            }
                                            if (listenableFuture != null) {
                                                ArrayList arrayList8 = new ArrayList();
                                                arrayList8.add(listenableFuture);
                                                r10 = arrayList8;
                                            } else {
                                                r10 = th2;
                                            }
                                            apktVar2 = wmnVar2.b;
                                            if (apktVar2 != null) {
                                                uwkVar = new uwk(arrayList4, 16);
                                                awrmVar4 = awrmVar2;
                                                uwkVar2 = new uwk(awrmVar4, 17);
                                                while (r0.hasNext()) {
                                                    th2 = th2;
                                                    i4 = apksVar.b;
                                                    if ((i4 & 1) != 0) {
                                                        i5 = apksVar.c;
                                                        if (i5 != 0) {
                                                            i6 = 4;
                                                        } else if (i5 != i2) {
                                                            i6 = 1;
                                                        } else if (i5 != 4) {
                                                            i6 = 2;
                                                        } else if (i5 != 5) {
                                                            i6 = i3;
                                                        } else {
                                                            i6 = 3;
                                                        }
                                                        if (i6 != 0) {
                                                            throw th2;
                                                        }
                                                        i7 = i6 - 1;
                                                        if (i7 != 0) {
                                                            if (i7 != 1) {
                                                                if (i7 != 2) {
                                                                    if (i5 == 5) {
                                                                        BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                                    } else {
                                                                        BooleanValue = i3;
                                                                    }
                                                                    if (BooleanValue != 0) {
                                                                        String str5 = apksVar.e;
                                                                        str5.getClass();
                                                                        uwkVar2.invoke(str5);
                                                                    }
                                                                } else if (i7 != 3) {
                                                                    throw new awmj();
                                                                }
                                                            }
                                                            th2 = th2;
                                                            i2 = 2;
                                                        } else if ((i4 & 2) != 0) {
                                                            ajnvVar = apksVar.f;
                                                            if (ajnvVar == null) {
                                                                ajnvVar = ajnv.a;
                                                            }
                                                            ajnvVar.getClass();
                                                            map = tnmVar.e;
                                                            uwk uwkVar5 = uwkVar2;
                                                            awrmVar2 = awrmVar4;
                                                            wmnVar = wmnVar2;
                                                            long epochMilli3 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                            tmsVarA = tmt.a();
                                                            tmsVarA.f(epochMilli3);
                                                            tmsVarA.g(epochMilli3);
                                                            tmsVarA.e(j);
                                                            if (map == null) {
                                                                map = agpn.b;
                                                            }
                                                            tmsVarA.d(map);
                                                            if (true != ajnvVar.e) {
                                                                i8 = 1;
                                                            } else {
                                                                i8 = 2;
                                                            }
                                                            tmsVarA.d = i8;
                                                            if ((ajnvVar.b & 4) != 0) {
                                                                tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                            }
                                                            tmt tmtVarA3 = tmsVarA.a();
                                                            i2 = 2;
                                                            if (apksVar.c == 2) {
                                                                ajegVar = (ajeg) apksVar.d;
                                                            } else {
                                                                ajegVar = ajeg.a;
                                                            }
                                                            aifvVar = ajegVar.b;
                                                            if (aifvVar == null) {
                                                                aifvVar = aifv.a;
                                                            }
                                                            byte[] bArrG3 = aifvVar.c.G();
                                                            String str6 = apksVar.e;
                                                            str6.getClass();
                                                            uwkVar.invoke(new tne(bArrG3, tmtVarA3, str6));
                                                            uwkVar2 = uwkVar5;
                                                            wmnVar2 = wmnVar;
                                                            awrmVar4 = awrmVar2;
                                                        } else {
                                                            i2 = 2;
                                                        }
                                                    }
                                                    j = 0;
                                                }
                                                awrmVar2 = awrmVar4;
                                                wmnVar = wmnVar2;
                                                Throwable th9 = th2;
                                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                wmoVar = wmkVar2.a;
                                                if (wmoVar.c()) {
                                                    aigmVarT = wmoVar.a(iterable);
                                                } else {
                                                    if (iterable == tnmVar.c()) {
                                                        aigmVarT = tnmVar.b();
                                                    } else {
                                                        aigmVarT = aigm.T(iterable);
                                                    }
                                                    aigm aigmVar9 = aigmVarT;
                                                    MessageLite messageLite9 = wmkVar2.f;
                                                    zza zzaVar9 = wmkVar2.g;
                                                    final wmk r14 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC9 = r14.c(tnmVar, aigmVar9, messageLite9, zzaVar9, wkwVar);
                                                    JniZero.l(afuuVarC2, th9);
                                                    wmnVar.b();
                                                    listE = r14.e(executor, wlzVarC9.a, r14.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r14.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC9, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite10;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite10 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r14.d.a(messageLite10);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r14.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC9, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite10;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite10 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r14.d.a(messageLite10);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                }
                                                aigm aigmVar10 = aigmVarT;
                                                MessageLite messageLite10 = wmkVar2.f;
                                                zza zzaVar10 = wmkVar2.g;
                                                final wmk r15 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC10 = r15.c(tnmVar, aigmVar10, messageLite10, zzaVar10, wkwVar);
                                                JniZero.l(afuuVarC2, th9);
                                                wmnVar.b();
                                                listE = r15.e(executor, wlzVarC10.a, r15.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r15.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC10, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite11;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite11 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r15.d.a(messageLite11);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r15.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC10, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite11;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite11 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r15.d.a(messageLite11);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                wmnVar = wmnVar2;
                                                Throwable th10 = th2;
                                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                wmoVar = wmkVar2.a;
                                                if (wmoVar.c()) {
                                                    aigmVarT = wmoVar.a(iterable);
                                                } else {
                                                    if (iterable == tnmVar.c()) {
                                                        aigmVarT = tnmVar.b();
                                                    } else {
                                                        aigmVarT = aigm.T(iterable);
                                                    }
                                                    aigm aigmVar11 = aigmVarT;
                                                    MessageLite messageLite11 = wmkVar2.f;
                                                    zza zzaVar11 = wmkVar2.g;
                                                    final wmk r16 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC11 = r16.c(tnmVar, aigmVar11, messageLite11, zzaVar11, wkwVar);
                                                    JniZero.l(afuuVarC2, th10);
                                                    wmnVar.b();
                                                    listE = r16.e(executor, wlzVarC11.a, r16.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r16.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite12;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite12 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r16.d.a(messageLite12);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r16.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite12;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite12 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r16.d.a(messageLite12);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                }
                                                aigm aigmVar12 = aigmVarT;
                                                MessageLite messageLite12 = wmkVar2.f;
                                                zza zzaVar12 = wmkVar2.g;
                                                final wmk r17 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC12 = r17.c(tnmVar, aigmVar12, messageLite12, zzaVar12, wkwVar);
                                                JniZero.l(afuuVarC2, th10);
                                                wmnVar.b();
                                                listE = r17.e(executor, wlzVarC12.a, r17.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r17.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC12, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite13;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite13 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r17.d.a(messageLite13);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r17.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC12, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite13;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite13 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r17.d.a(messageLite13);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                            JniZero.l(afuuVar, null);
                                            return listenableFutureN;
                                        }
                                        r0 = xplVar.b;
                                        r25 = r0;
                                        if (iterableJ != null) {
                                            hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                        } else {
                                            hhoVar = null;
                                        }
                                        if (xplVar != null) {
                                            r30 = xplVar.a;
                                        } else {
                                            r30 = 0;
                                        }
                                        wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                        wmnVar2 = wmnVar;
                                        iterable = wmnVar2.a;
                                        if (wmnVar2.d == null) {
                                            z4 = false;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            xxjVar = new xxj(wmnVar2, null);
                                            afuuVarC3 = afwt.c(78, "processFutAsync");
                                            th2 = null;
                                            wmkVar2 = wmkVar;
                                            dovVar = wmkVar2.k;
                                            zwaVar = wmkVar2.e.u;
                                            if (dovVar.a.isEmpty()) {
                                                listenableFutureAq = aher.a;
                                                i2 = 2;
                                                i3 = 0;
                                            } else {
                                                i2 = 2;
                                                i3 = 0;
                                                listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                            }
                                            listenableFuture = listenableFutureAq;
                                            afuuVarC3.a(listenableFuture);
                                            JniZero.l(afuuVarC3, th2);
                                        } else {
                                            wmkVar2 = wmkVar;
                                            i2 = 2;
                                            th2 = null;
                                            i3 = 0;
                                            albeVarA = wmnVar2.a();
                                            if (albeVarA != null) {
                                                afuuVarC = afwt.c(79, "processFutAsync");
                                                ListenableFuture listenableFutureU4 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                                afuuVarC.a(listenableFutureU4);
                                                JniZero.l(afuuVarC, null);
                                                listenableFuture = listenableFutureU4;
                                            } else {
                                                listenableFuture = null;
                                            }
                                        }
                                        if (listenableFuture != null) {
                                            ArrayList arrayList9 = new ArrayList();
                                            arrayList9.add(listenableFuture);
                                            r10 = arrayList9;
                                        } else {
                                            r10 = th2;
                                        }
                                        apktVar2 = wmnVar2.b;
                                        if (apktVar2 != null) {
                                            uwkVar = new uwk(arrayList4, 16);
                                            awrmVar4 = awrmVar2;
                                            uwkVar2 = new uwk(awrmVar4, 17);
                                            while (r0.hasNext()) {
                                                th2 = th2;
                                                i4 = apksVar.b;
                                                if ((i4 & 1) != 0) {
                                                    i5 = apksVar.c;
                                                    if (i5 != 0) {
                                                        i6 = 4;
                                                    } else if (i5 != i2) {
                                                        i6 = 1;
                                                    } else if (i5 != 4) {
                                                        i6 = 2;
                                                    } else if (i5 != 5) {
                                                        i6 = i3;
                                                    } else {
                                                        i6 = 3;
                                                    }
                                                    if (i6 != 0) {
                                                        throw th2;
                                                    }
                                                    i7 = i6 - 1;
                                                    if (i7 != 0) {
                                                        if (i7 != 1) {
                                                            if (i7 != 2) {
                                                                if (i5 == 5) {
                                                                    BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                                } else {
                                                                    BooleanValue = i3;
                                                                }
                                                                if (BooleanValue != 0) {
                                                                    String str7 = apksVar.e;
                                                                    str7.getClass();
                                                                    uwkVar2.invoke(str7);
                                                                }
                                                            } else if (i7 != 3) {
                                                                throw new awmj();
                                                            }
                                                        }
                                                        th2 = th2;
                                                        i2 = 2;
                                                    } else if ((i4 & 2) != 0) {
                                                        ajnvVar = apksVar.f;
                                                        if (ajnvVar == null) {
                                                            ajnvVar = ajnv.a;
                                                        }
                                                        ajnvVar.getClass();
                                                        map = tnmVar.e;
                                                        uwk uwkVar6 = uwkVar2;
                                                        awrmVar2 = awrmVar4;
                                                        wmnVar = wmnVar2;
                                                        long epochMilli4 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                        tmsVarA = tmt.a();
                                                        tmsVarA.f(epochMilli4);
                                                        tmsVarA.g(epochMilli4);
                                                        tmsVarA.e(j);
                                                        if (map == null) {
                                                            map = agpn.b;
                                                        }
                                                        tmsVarA.d(map);
                                                        if (true != ajnvVar.e) {
                                                            i8 = 1;
                                                        } else {
                                                            i8 = 2;
                                                        }
                                                        tmsVarA.d = i8;
                                                        if ((ajnvVar.b & 4) != 0) {
                                                            tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                        }
                                                        tmt tmtVarA4 = tmsVarA.a();
                                                        i2 = 2;
                                                        if (apksVar.c == 2) {
                                                            ajegVar = (ajeg) apksVar.d;
                                                        } else {
                                                            ajegVar = ajeg.a;
                                                        }
                                                        aifvVar = ajegVar.b;
                                                        if (aifvVar == null) {
                                                            aifvVar = aifv.a;
                                                        }
                                                        byte[] bArrG4 = aifvVar.c.G();
                                                        String str8 = apksVar.e;
                                                        str8.getClass();
                                                        uwkVar.invoke(new tne(bArrG4, tmtVarA4, str8));
                                                        uwkVar2 = uwkVar6;
                                                        wmnVar2 = wmnVar;
                                                        awrmVar4 = awrmVar2;
                                                    } else {
                                                        i2 = 2;
                                                    }
                                                }
                                                j = 0;
                                            }
                                            awrmVar2 = awrmVar4;
                                            wmnVar = wmnVar2;
                                            Throwable th11 = th2;
                                            afuuVarC2 = afwt.c(84, "parseResponseProto");
                                            wmoVar = wmkVar2.a;
                                            if (wmoVar.c()) {
                                                aigmVarT = wmoVar.a(iterable);
                                            } else {
                                                if (iterable == tnmVar.c()) {
                                                    aigmVarT = tnmVar.b();
                                                } else {
                                                    aigmVarT = aigm.T(iterable);
                                                }
                                                aigm aigmVar13 = aigmVarT;
                                                MessageLite messageLite13 = wmkVar2.f;
                                                zza zzaVar13 = wmkVar2.g;
                                                final wmk r18 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC13 = r18.c(tnmVar, aigmVar13, messageLite13, zzaVar13, wkwVar);
                                                JniZero.l(afuuVarC2, th11);
                                                wmnVar.b();
                                                listE = r18.e(executor, wlzVarC13.a, r18.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r18.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC13, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite14;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite14 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r18.d.a(messageLite14);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r18.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC13, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite14;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite14 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r18.d.a(messageLite14);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                            aigm aigmVar14 = aigmVarT;
                                            MessageLite messageLite14 = wmkVar2.f;
                                            zza zzaVar14 = wmkVar2.g;
                                            final wmk r19 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC14 = r19.c(tnmVar, aigmVar14, messageLite14, zzaVar14, wkwVar);
                                            JniZero.l(afuuVarC2, th11);
                                            wmnVar.b();
                                            listE = r19.e(executor, wlzVarC14.a, r19.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r19.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC14, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite15;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite15 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r19.d.a(messageLite15);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r19.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC14, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite15;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite15 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r19.d.a(messageLite15);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            wmnVar = wmnVar2;
                                            Throwable th12 = th2;
                                            afuuVarC2 = afwt.c(84, "parseResponseProto");
                                            wmoVar = wmkVar2.a;
                                            if (wmoVar.c()) {
                                                aigmVarT = wmoVar.a(iterable);
                                            } else {
                                                if (iterable == tnmVar.c()) {
                                                    aigmVarT = tnmVar.b();
                                                } else {
                                                    aigmVarT = aigm.T(iterable);
                                                }
                                                aigm aigmVar15 = aigmVarT;
                                                MessageLite messageLite15 = wmkVar2.f;
                                                zza zzaVar15 = wmkVar2.g;
                                                final wmk r110 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC15 = r110.c(tnmVar, aigmVar15, messageLite15, zzaVar15, wkwVar);
                                                JniZero.l(afuuVarC2, th12);
                                                wmnVar.b();
                                                listE = r110.e(executor, wlzVarC15.a, r110.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC15, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite16;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite16 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r110.d.a(messageLite16);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC15, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite16;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite16 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r110.d.a(messageLite16);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                            aigm aigmVar16 = aigmVarT;
                                            MessageLite messageLite16 = wmkVar2.f;
                                            zza zzaVar16 = wmkVar2.g;
                                            final wmk r111 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC16 = r111.c(tnmVar, aigmVar16, messageLite16, zzaVar16, wkwVar);
                                            JniZero.l(afuuVarC2, th12);
                                            wmnVar.b();
                                            listE = r111.e(executor, wlzVarC16.a, r111.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC16, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite17;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite17 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r111.d.a(messageLite17);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC16, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite17;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite17 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r111.d.a(messageLite17);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        }
                                        JniZero.l(afuuVar, null);
                                        return listenableFutureN;
                                    }
                                    if (byteBuffer3.hasArray()) {
                                        if (arrayList.size() != 2 && arrayList.size() != 3) {
                                            wmkVar = wmkVar3;
                                            z3 = z5;
                                            awrmVar2 = awrmVar5;
                                            afuuVar = afuuVarC4;
                                            arrayList2 = arrayList5;
                                            xplVar = null;
                                            j = 0;
                                            if (xplVar == null) {
                                                r0 = C;
                                                if (!arrayList.isEmpty()) {
                                                    arrayList3 = new ArrayList(C.size() + arrayList.size());
                                                    it = arrayList.iterator();
                                                    if (it.hasNext()) {
                                                        wmmVar = (wmm) it.next();
                                                    } else {
                                                        wmmVar = null;
                                                    }
                                                    j2 = j;
                                                    while (r0.hasNext()) {
                                                        long jRemaining3 = ((long) byteBuffer2.remaining()) + j2;
                                                        if (wmmVar != null) {
                                                            it2 = it;
                                                            arrayList3.add(byteBuffer2.duplicate());
                                                        } else {
                                                            it2 = it;
                                                            arrayList3.add(byteBuffer2.duplicate());
                                                        }
                                                        j2 = jRemaining3;
                                                        it = it2;
                                                    }
                                                    r25 = arrayList3;
                                                }
                                                if (iterableJ != null) {
                                                    hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                                } else {
                                                    hhoVar = null;
                                                }
                                                if (xplVar != null) {
                                                    r30 = xplVar.a;
                                                } else {
                                                    r30 = 0;
                                                }
                                                wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                                wmnVar2 = wmnVar;
                                                iterable = wmnVar2.a;
                                                if (wmnVar2.d == null) {
                                                    z4 = false;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    xxjVar = new xxj(wmnVar2, null);
                                                    afuuVarC3 = afwt.c(78, "processFutAsync");
                                                    th2 = null;
                                                    wmkVar2 = wmkVar;
                                                    dovVar = wmkVar2.k;
                                                    zwaVar = wmkVar2.e.u;
                                                    if (dovVar.a.isEmpty()) {
                                                        listenableFutureAq = aher.a;
                                                        i2 = 2;
                                                        i3 = 0;
                                                    } else {
                                                        i2 = 2;
                                                        i3 = 0;
                                                        listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                                    }
                                                    listenableFuture = listenableFutureAq;
                                                    afuuVarC3.a(listenableFuture);
                                                    JniZero.l(afuuVarC3, th2);
                                                } else {
                                                    wmkVar2 = wmkVar;
                                                    i2 = 2;
                                                    th2 = null;
                                                    i3 = 0;
                                                    albeVarA = wmnVar2.a();
                                                    if (albeVarA != null) {
                                                        afuuVarC = afwt.c(79, "processFutAsync");
                                                        ListenableFuture listenableFutureU5 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                                        afuuVarC.a(listenableFutureU5);
                                                        JniZero.l(afuuVarC, null);
                                                        listenableFuture = listenableFutureU5;
                                                    } else {
                                                        listenableFuture = null;
                                                    }
                                                }
                                                if (listenableFuture != null) {
                                                    ArrayList arrayList10 = new ArrayList();
                                                    arrayList10.add(listenableFuture);
                                                    r10 = arrayList10;
                                                } else {
                                                    r10 = th2;
                                                }
                                                apktVar2 = wmnVar2.b;
                                                if (apktVar2 != null) {
                                                    uwkVar = new uwk(arrayList4, 16);
                                                    awrmVar4 = awrmVar2;
                                                    uwkVar2 = new uwk(awrmVar4, 17);
                                                    while (r0.hasNext()) {
                                                        th2 = th2;
                                                        i4 = apksVar.b;
                                                        if ((i4 & 1) != 0) {
                                                            i5 = apksVar.c;
                                                            if (i5 != 0) {
                                                                i6 = 4;
                                                            } else if (i5 != i2) {
                                                                i6 = 1;
                                                            } else if (i5 != 4) {
                                                                i6 = 2;
                                                            } else if (i5 != 5) {
                                                                i6 = i3;
                                                            } else {
                                                                i6 = 3;
                                                            }
                                                            if (i6 != 0) {
                                                                throw th2;
                                                            }
                                                            i7 = i6 - 1;
                                                            if (i7 != 0) {
                                                                if (i7 != 1) {
                                                                    if (i7 != 2) {
                                                                        if (i5 == 5) {
                                                                            BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                                        } else {
                                                                            BooleanValue = i3;
                                                                        }
                                                                        if (BooleanValue != 0) {
                                                                            String str9 = apksVar.e;
                                                                            str9.getClass();
                                                                            uwkVar2.invoke(str9);
                                                                        }
                                                                    } else if (i7 != 3) {
                                                                        throw new awmj();
                                                                    }
                                                                }
                                                                th2 = th2;
                                                                i2 = 2;
                                                            } else if ((i4 & 2) != 0) {
                                                                ajnvVar = apksVar.f;
                                                                if (ajnvVar == null) {
                                                                    ajnvVar = ajnv.a;
                                                                }
                                                                ajnvVar.getClass();
                                                                map = tnmVar.e;
                                                                uwk uwkVar7 = uwkVar2;
                                                                awrmVar2 = awrmVar4;
                                                                wmnVar = wmnVar2;
                                                                long epochMilli5 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                                tmsVarA = tmt.a();
                                                                tmsVarA.f(epochMilli5);
                                                                tmsVarA.g(epochMilli5);
                                                                tmsVarA.e(j);
                                                                if (map == null) {
                                                                    map = agpn.b;
                                                                }
                                                                tmsVarA.d(map);
                                                                if (true != ajnvVar.e) {
                                                                    i8 = 1;
                                                                } else {
                                                                    i8 = 2;
                                                                }
                                                                tmsVarA.d = i8;
                                                                if ((ajnvVar.b & 4) != 0) {
                                                                    tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                                }
                                                                tmt tmtVarA5 = tmsVarA.a();
                                                                i2 = 2;
                                                                if (apksVar.c == 2) {
                                                                    ajegVar = (ajeg) apksVar.d;
                                                                } else {
                                                                    ajegVar = ajeg.a;
                                                                }
                                                                aifvVar = ajegVar.b;
                                                                if (aifvVar == null) {
                                                                    aifvVar = aifv.a;
                                                                }
                                                                byte[] bArrG5 = aifvVar.c.G();
                                                                String str10 = apksVar.e;
                                                                str10.getClass();
                                                                uwkVar.invoke(new tne(bArrG5, tmtVarA5, str10));
                                                                uwkVar2 = uwkVar7;
                                                                wmnVar2 = wmnVar;
                                                                awrmVar4 = awrmVar2;
                                                            } else {
                                                                i2 = 2;
                                                            }
                                                        }
                                                        j = 0;
                                                    }
                                                    awrmVar2 = awrmVar4;
                                                    wmnVar = wmnVar2;
                                                    Throwable th13 = th2;
                                                    afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                    wmoVar = wmkVar2.a;
                                                    if (wmoVar.c()) {
                                                        aigmVarT = wmoVar.a(iterable);
                                                    } else {
                                                        if (iterable == tnmVar.c()) {
                                                            aigmVarT = tnmVar.b();
                                                        } else {
                                                            aigmVarT = aigm.T(iterable);
                                                        }
                                                        aigm aigmVar17 = aigmVarT;
                                                        MessageLite messageLite17 = wmkVar2.f;
                                                        zza zzaVar17 = wmkVar2.g;
                                                        final wmk r112 = wmkVar2;
                                                        awrmVar3 = awrmVar2;
                                                        wlz wlzVarC17 = r112.c(tnmVar, aigmVar17, messageLite17, zzaVar17, wkwVar);
                                                        JniZero.l(afuuVarC2, th13);
                                                        wmnVar.b();
                                                        listE = r112.e(executor, wlzVarC17.a, r112.e.u);
                                                        if (r10 == 0) {
                                                            if (listE.isEmpty()) {
                                                                r11 = awno.a;
                                                            } else {
                                                                r3 = listE;
                                                            }
                                                            list3 = (List) awrmVar3.a;
                                                            if (list3 == null) {
                                                                list3 = awno.a;
                                                            }
                                                            afuuVar = afuuVar;
                                                            listenableFutureN = r112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC17, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                                @Override // defpackage.awql
                                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                    MessageLite messageLite18;
                                                                    tnx tnxVar = (tnx) obj2;
                                                                    List list4 = (List) obj3;
                                                                    List list5 = (List) obj4;
                                                                    tnxVar.getClass();
                                                                    list4.getClass();
                                                                    list5.getClass();
                                                                    boolean z7 = false;
                                                                    if (tnxVar.h() && (messageLite18 = (MessageLite) tnxVar.c().a) != null) {
                                                                        alop alopVar = (alop) r112.d.a(messageLite18);
                                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                            z7 = true;
                                                                        }
                                                                    }
                                                                    return new tnq(tnxVar, list4, list5, z7);
                                                                }
                                                            });
                                                            afuuVar.a(listenableFutureN);
                                                        } else {
                                                            r10.addAll(listE);
                                                            r11 = r10;
                                                        }
                                                        r3 = r11;
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC17, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite18;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite18 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r112.d.a(messageLite18);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    }
                                                    aigm aigmVar18 = aigmVarT;
                                                    MessageLite messageLite18 = wmkVar2.f;
                                                    zza zzaVar18 = wmkVar2.g;
                                                    final wmk r113 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC18 = r113.c(tnmVar, aigmVar18, messageLite18, zzaVar18, wkwVar);
                                                    JniZero.l(afuuVarC2, th13);
                                                    wmnVar.b();
                                                    listE = r113.e(executor, wlzVarC18.a, r113.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC18, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite19;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite19 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r113.d.a(messageLite19);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC18, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite19;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite19 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r113.d.a(messageLite19);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    wmnVar = wmnVar2;
                                                    Throwable th14 = th2;
                                                    afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                    wmoVar = wmkVar2.a;
                                                    if (wmoVar.c()) {
                                                        aigmVarT = wmoVar.a(iterable);
                                                    } else {
                                                        if (iterable == tnmVar.c()) {
                                                            aigmVarT = tnmVar.b();
                                                        } else {
                                                            aigmVarT = aigm.T(iterable);
                                                        }
                                                        aigm aigmVar19 = aigmVarT;
                                                        MessageLite messageLite19 = wmkVar2.f;
                                                        zza zzaVar19 = wmkVar2.g;
                                                        final wmk r114 = wmkVar2;
                                                        awrmVar3 = awrmVar2;
                                                        wlz wlzVarC19 = r114.c(tnmVar, aigmVar19, messageLite19, zzaVar19, wkwVar);
                                                        JniZero.l(afuuVarC2, th14);
                                                        wmnVar.b();
                                                        listE = r114.e(executor, wlzVarC19.a, r114.e.u);
                                                        if (r10 == 0) {
                                                            if (listE.isEmpty()) {
                                                                r11 = awno.a;
                                                            } else {
                                                                r3 = listE;
                                                            }
                                                            list3 = (List) awrmVar3.a;
                                                            if (list3 == null) {
                                                                list3 = awno.a;
                                                            }
                                                            afuuVar = afuuVar;
                                                            listenableFutureN = r114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC19, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                                @Override // defpackage.awql
                                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                    MessageLite messageLite110;
                                                                    tnx tnxVar = (tnx) obj2;
                                                                    List list4 = (List) obj3;
                                                                    List list5 = (List) obj4;
                                                                    tnxVar.getClass();
                                                                    list4.getClass();
                                                                    list5.getClass();
                                                                    boolean z7 = false;
                                                                    if (tnxVar.h() && (messageLite110 = (MessageLite) tnxVar.c().a) != null) {
                                                                        alop alopVar = (alop) r114.d.a(messageLite110);
                                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                            z7 = true;
                                                                        }
                                                                    }
                                                                    return new tnq(tnxVar, list4, list5, z7);
                                                                }
                                                            });
                                                            afuuVar.a(listenableFutureN);
                                                        } else {
                                                            r10.addAll(listE);
                                                            r11 = r10;
                                                        }
                                                        r3 = r11;
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC19, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite110;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite110 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r114.d.a(messageLite110);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    }
                                                    aigm aigmVar110 = aigmVarT;
                                                    MessageLite messageLite110 = wmkVar2.f;
                                                    zza zzaVar110 = wmkVar2.g;
                                                    final wmk r115 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC110 = r115.c(tnmVar, aigmVar110, messageLite110, zzaVar110, wkwVar);
                                                    JniZero.l(afuuVarC2, th14);
                                                    wmnVar.b();
                                                    listE = r115.e(executor, wlzVarC110.a, r115.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite111;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite111 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r115.d.a(messageLite111);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite111;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite111 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r115.d.a(messageLite111);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                }
                                                JniZero.l(afuuVar, null);
                                                return listenableFutureN;
                                            }
                                            r0 = xplVar.b;
                                            r25 = r0;
                                            if (iterableJ != null) {
                                                hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                            } else {
                                                hhoVar = null;
                                            }
                                            if (xplVar != null) {
                                                r30 = xplVar.a;
                                            } else {
                                                r30 = 0;
                                            }
                                            wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                            wmnVar2 = wmnVar;
                                            iterable = wmnVar2.a;
                                            if (wmnVar2.d == null) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            if (z4) {
                                                xxjVar = new xxj(wmnVar2, null);
                                                afuuVarC3 = afwt.c(78, "processFutAsync");
                                                th2 = null;
                                                wmkVar2 = wmkVar;
                                                dovVar = wmkVar2.k;
                                                zwaVar = wmkVar2.e.u;
                                                if (dovVar.a.isEmpty()) {
                                                    listenableFutureAq = aher.a;
                                                    i2 = 2;
                                                    i3 = 0;
                                                } else {
                                                    i2 = 2;
                                                    i3 = 0;
                                                    listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                                }
                                                listenableFuture = listenableFutureAq;
                                                afuuVarC3.a(listenableFuture);
                                                JniZero.l(afuuVarC3, th2);
                                            } else {
                                                wmkVar2 = wmkVar;
                                                i2 = 2;
                                                th2 = null;
                                                i3 = 0;
                                                albeVarA = wmnVar2.a();
                                                if (albeVarA != null) {
                                                    afuuVarC = afwt.c(79, "processFutAsync");
                                                    ListenableFuture listenableFutureU6 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                                    afuuVarC.a(listenableFutureU6);
                                                    JniZero.l(afuuVarC, null);
                                                    listenableFuture = listenableFutureU6;
                                                } else {
                                                    listenableFuture = null;
                                                }
                                            }
                                            if (listenableFuture != null) {
                                                ArrayList arrayList11 = new ArrayList();
                                                arrayList11.add(listenableFuture);
                                                r10 = arrayList11;
                                            } else {
                                                r10 = th2;
                                            }
                                            apktVar2 = wmnVar2.b;
                                            if (apktVar2 != null) {
                                                uwkVar = new uwk(arrayList4, 16);
                                                awrmVar4 = awrmVar2;
                                                uwkVar2 = new uwk(awrmVar4, 17);
                                                while (r0.hasNext()) {
                                                    th2 = th2;
                                                    i4 = apksVar.b;
                                                    if ((i4 & 1) != 0) {
                                                        i5 = apksVar.c;
                                                        if (i5 != 0) {
                                                            i6 = 4;
                                                        } else if (i5 != i2) {
                                                            i6 = 1;
                                                        } else if (i5 != 4) {
                                                            i6 = 2;
                                                        } else if (i5 != 5) {
                                                            i6 = i3;
                                                        } else {
                                                            i6 = 3;
                                                        }
                                                        if (i6 != 0) {
                                                            throw th2;
                                                        }
                                                        i7 = i6 - 1;
                                                        if (i7 != 0) {
                                                            if (i7 != 1) {
                                                                if (i7 != 2) {
                                                                    if (i5 == 5) {
                                                                        BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                                    } else {
                                                                        BooleanValue = i3;
                                                                    }
                                                                    if (BooleanValue != 0) {
                                                                        String str11 = apksVar.e;
                                                                        str11.getClass();
                                                                        uwkVar2.invoke(str11);
                                                                    }
                                                                } else if (i7 != 3) {
                                                                    throw new awmj();
                                                                }
                                                            }
                                                            th2 = th2;
                                                            i2 = 2;
                                                        } else if ((i4 & 2) != 0) {
                                                            ajnvVar = apksVar.f;
                                                            if (ajnvVar == null) {
                                                                ajnvVar = ajnv.a;
                                                            }
                                                            ajnvVar.getClass();
                                                            map = tnmVar.e;
                                                            uwk uwkVar8 = uwkVar2;
                                                            awrmVar2 = awrmVar4;
                                                            wmnVar = wmnVar2;
                                                            long epochMilli6 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                            tmsVarA = tmt.a();
                                                            tmsVarA.f(epochMilli6);
                                                            tmsVarA.g(epochMilli6);
                                                            tmsVarA.e(j);
                                                            if (map == null) {
                                                                map = agpn.b;
                                                            }
                                                            tmsVarA.d(map);
                                                            if (true != ajnvVar.e) {
                                                                i8 = 1;
                                                            } else {
                                                                i8 = 2;
                                                            }
                                                            tmsVarA.d = i8;
                                                            if ((ajnvVar.b & 4) != 0) {
                                                                tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                            }
                                                            tmt tmtVarA6 = tmsVarA.a();
                                                            i2 = 2;
                                                            if (apksVar.c == 2) {
                                                                ajegVar = (ajeg) apksVar.d;
                                                            } else {
                                                                ajegVar = ajeg.a;
                                                            }
                                                            aifvVar = ajegVar.b;
                                                            if (aifvVar == null) {
                                                                aifvVar = aifv.a;
                                                            }
                                                            byte[] bArrG6 = aifvVar.c.G();
                                                            String str12 = apksVar.e;
                                                            str12.getClass();
                                                            uwkVar.invoke(new tne(bArrG6, tmtVarA6, str12));
                                                            uwkVar2 = uwkVar8;
                                                            wmnVar2 = wmnVar;
                                                            awrmVar4 = awrmVar2;
                                                        } else {
                                                            i2 = 2;
                                                        }
                                                    }
                                                    j = 0;
                                                }
                                                awrmVar2 = awrmVar4;
                                                wmnVar = wmnVar2;
                                                Throwable th15 = th2;
                                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                wmoVar = wmkVar2.a;
                                                if (wmoVar.c()) {
                                                    aigmVarT = wmoVar.a(iterable);
                                                } else {
                                                    if (iterable == tnmVar.c()) {
                                                        aigmVarT = tnmVar.b();
                                                    } else {
                                                        aigmVarT = aigm.T(iterable);
                                                    }
                                                    aigm aigmVar111 = aigmVarT;
                                                    MessageLite messageLite111 = wmkVar2.f;
                                                    zza zzaVar111 = wmkVar2.g;
                                                    final wmk r116 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC111 = r116.c(tnmVar, aigmVar111, messageLite111, zzaVar111, wkwVar);
                                                    JniZero.l(afuuVarC2, th15);
                                                    wmnVar.b();
                                                    listE = r116.e(executor, wlzVarC111.a, r116.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite112;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite112 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r116.d.a(messageLite112);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite112;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite112 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r116.d.a(messageLite112);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                }
                                                aigm aigmVar112 = aigmVarT;
                                                MessageLite messageLite112 = wmkVar2.f;
                                                zza zzaVar112 = wmkVar2.g;
                                                final wmk r117 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC112 = r117.c(tnmVar, aigmVar112, messageLite112, zzaVar112, wkwVar);
                                                JniZero.l(afuuVarC2, th15);
                                                wmnVar.b();
                                                listE = r117.e(executor, wlzVarC112.a, r117.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite113;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite113 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r117.d.a(messageLite113);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite113;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite113 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r117.d.a(messageLite113);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                wmnVar = wmnVar2;
                                                Throwable th16 = th2;
                                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                wmoVar = wmkVar2.a;
                                                if (wmoVar.c()) {
                                                    aigmVarT = wmoVar.a(iterable);
                                                } else {
                                                    if (iterable == tnmVar.c()) {
                                                        aigmVarT = tnmVar.b();
                                                    } else {
                                                        aigmVarT = aigm.T(iterable);
                                                    }
                                                    aigm aigmVar113 = aigmVarT;
                                                    MessageLite messageLite113 = wmkVar2.f;
                                                    zza zzaVar113 = wmkVar2.g;
                                                    final wmk r118 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC113 = r118.c(tnmVar, aigmVar113, messageLite113, zzaVar113, wkwVar);
                                                    JniZero.l(afuuVarC2, th16);
                                                    wmnVar.b();
                                                    listE = r118.e(executor, wlzVarC113.a, r118.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite114;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite114 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r118.d.a(messageLite114);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite114;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite114 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r118.d.a(messageLite114);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                }
                                                aigm aigmVar114 = aigmVarT;
                                                MessageLite messageLite114 = wmkVar2.f;
                                                zza zzaVar114 = wmkVar2.g;
                                                final wmk r119 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC114 = r119.c(tnmVar, aigmVar114, messageLite114, zzaVar114, wkwVar);
                                                JniZero.l(afuuVarC2, th16);
                                                wmnVar.b();
                                                listE = r119.e(executor, wlzVarC114.a, r119.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite115;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite115 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r119.d.a(messageLite115);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite115;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite115 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r119.d.a(messageLite115);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                            JniZero.l(afuuVar, null);
                                            return listenableFutureN;
                                        }
                                        wmm wmmVar2 = (wmm) arrayList.get(0);
                                        wmm wmmVar3 = (wmm) arrayList.get(1);
                                        ByteBuffer byteBuffer4 = wmmVar2.c;
                                        if (byteBuffer4 == null) {
                                            wmkVar = wmkVar3;
                                            z3 = z5;
                                            awrmVar2 = awrmVar5;
                                            afuuVar = afuuVarC4;
                                            arrayList2 = arrayList5;
                                            xplVar = null;
                                            j = 0;
                                        } else {
                                            j = 0;
                                            if (wmmVar2.a == 0 && wmmVar3.c == null) {
                                                long j5 = wmmVar3.a;
                                                wmkVar = wmkVar3;
                                                long j6 = wmmVar2.b;
                                                if (j5 >= j6) {
                                                    int iRemaining = byteBuffer3.remaining();
                                                    if (arrayList.size() == 3) {
                                                        wmm wmmVar4 = (wmm) arrayList.get(2);
                                                        if (wmmVar4.c == null) {
                                                            afuuVar = afuuVarC4;
                                                            arrayList2 = arrayList5;
                                                            try {
                                                                try {
                                                                    long j7 = wmmVar4.a;
                                                                    z3 = z5;
                                                                    awrmVar2 = awrmVar5;
                                                                    try {
                                                                        if (j7 >= wmmVar3.b && wmmVar4.b == iRemaining) {
                                                                            iRemaining = (int) j7;
                                                                        }
                                                                    } catch (IOException e) {
                                                                        e = e;
                                                                        afuuVar = afuuVar;
                                                                        awrmVar = awrmVar2;
                                                                        twu.c(6, "Failed to split response", e);
                                                                        tnx tnxVarD = tnx.d(new tnp(e));
                                                                        list = (List) awrmVar.a;
                                                                        if (list == null) {
                                                                            list = awno.a;
                                                                        }
                                                                        listenableFutureN = ahng.n(new tnq(tnxVarD, arrayList4, list, 8));
                                                                    }
                                                                } catch (IOException e2) {
                                                                    e = e2;
                                                                    awrmVar2 = awrmVar5;
                                                                    afuuVar = afuuVar;
                                                                    awrmVar = awrmVar2;
                                                                    twu.c(6, "Failed to split response", e);
                                                                    tnx tnxVarD2 = tnx.d(new tnp(e));
                                                                    list = (List) awrmVar.a;
                                                                    if (list == null) {
                                                                        list = awno.a;
                                                                    }
                                                                    listenableFutureN = ahng.n(new tnq(tnxVarD2, arrayList4, list, 8));
                                                                }
                                                            } catch (Throwable th17) {
                                                                th = th17;
                                                                th = th;
                                                                r1 = afuuVar;
                                                                throw th;
                                                            }
                                                        }
                                                    } else {
                                                        z3 = z5;
                                                        awrmVar2 = awrmVar5;
                                                        afuuVar = afuuVarC4;
                                                        arrayList2 = arrayList5;
                                                    }
                                                    int i12 = (int) j6;
                                                    int i13 = (int) wmmVar3.b;
                                                    int i14 = ((int) j5) - i12;
                                                    int iRemaining2 = byteBuffer4.remaining();
                                                    final int i15 = (i13 - i14) - iRemaining2;
                                                    if (i14 <= 16384 && i15 >= 0 && iRemaining - i13 > (i14 << 1)) {
                                                        final byte[] bArrArray = byteBuffer3.array();
                                                        bArrArray.getClass();
                                                        final int iArrayOffset = byteBuffer3.arrayOffset() + byteBuffer3.position();
                                                        int i16 = iArrayOffset + i15;
                                                        int i17 = iArrayOffset + i13;
                                                        final byte[] bArrAM = atqq.aM(bArrArray, i16, i17);
                                                        System.arraycopy(bArrArray, iArrayOffset + i12, bArrArray, i17 - i14, i14);
                                                        byteBuffer4.duplicate().get(bArrArray, i16, iRemaining2);
                                                        final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                                        ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
                                                        byteBufferDuplicate.position(byteBuffer3.position() + i15);
                                                        byteBufferDuplicate.limit(byteBuffer3.position() + iRemaining);
                                                        xplVar = new xpl(atqq.H(byteBufferDuplicate), new Function0() { // from class: wml
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                ExtensionRegistryLite extensionRegistryLite = wmo.a;
                                                                if (atomicBoolean.compareAndSet(false, true)) {
                                                                    int i18 = i15;
                                                                    int i19 = iArrayOffset;
                                                                    byte[] bArr = bArrArray;
                                                                    byte[] bArr2 = bArrAM;
                                                                    System.arraycopy(bArr2, 0, bArr, i19 + i18, bArr2.length);
                                                                }
                                                                return awmy.a;
                                                            }
                                                        }, (short[]) null);
                                                    }
                                                }
                                            } else {
                                                wmkVar = wmkVar3;
                                            }
                                            z3 = z5;
                                            awrmVar2 = awrmVar5;
                                            afuuVar = afuuVarC4;
                                            arrayList2 = arrayList5;
                                        }
                                        if (xplVar == null) {
                                            r0 = C;
                                            if (!arrayList.isEmpty()) {
                                                arrayList3 = new ArrayList(C.size() + arrayList.size());
                                                it = arrayList.iterator();
                                                if (it.hasNext()) {
                                                    wmmVar = (wmm) it.next();
                                                } else {
                                                    wmmVar = null;
                                                }
                                                j2 = j;
                                                while (r0.hasNext()) {
                                                    long jRemaining4 = ((long) byteBuffer2.remaining()) + j2;
                                                    if (wmmVar != null) {
                                                        it2 = it;
                                                        arrayList3.add(byteBuffer2.duplicate());
                                                    } else {
                                                        it2 = it;
                                                        arrayList3.add(byteBuffer2.duplicate());
                                                    }
                                                    j2 = jRemaining4;
                                                    it = it2;
                                                }
                                                r25 = arrayList3;
                                            }
                                            if (iterableJ != null) {
                                                hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                            } else {
                                                hhoVar = null;
                                            }
                                            if (xplVar != null) {
                                                r30 = xplVar.a;
                                            } else {
                                                r30 = 0;
                                            }
                                            wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                            wmnVar2 = wmnVar;
                                            iterable = wmnVar2.a;
                                            if (wmnVar2.d == null) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            if (z4) {
                                                xxjVar = new xxj(wmnVar2, null);
                                                afuuVarC3 = afwt.c(78, "processFutAsync");
                                                th2 = null;
                                                wmkVar2 = wmkVar;
                                                dovVar = wmkVar2.k;
                                                zwaVar = wmkVar2.e.u;
                                                if (dovVar.a.isEmpty()) {
                                                    listenableFutureAq = aher.a;
                                                    i2 = 2;
                                                    i3 = 0;
                                                } else {
                                                    i2 = 2;
                                                    i3 = 0;
                                                    listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                                }
                                                listenableFuture = listenableFutureAq;
                                                afuuVarC3.a(listenableFuture);
                                                JniZero.l(afuuVarC3, th2);
                                            } else {
                                                wmkVar2 = wmkVar;
                                                i2 = 2;
                                                th2 = null;
                                                i3 = 0;
                                                albeVarA = wmnVar2.a();
                                                if (albeVarA != null) {
                                                    afuuVarC = afwt.c(79, "processFutAsync");
                                                    ListenableFuture listenableFutureU7 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                                    afuuVarC.a(listenableFutureU7);
                                                    JniZero.l(afuuVarC, null);
                                                    listenableFuture = listenableFutureU7;
                                                } else {
                                                    listenableFuture = null;
                                                }
                                            }
                                            if (listenableFuture != null) {
                                                ArrayList arrayList12 = new ArrayList();
                                                arrayList12.add(listenableFuture);
                                                r10 = arrayList12;
                                            } else {
                                                r10 = th2;
                                            }
                                            apktVar2 = wmnVar2.b;
                                            if (apktVar2 != null) {
                                                uwkVar = new uwk(arrayList4, 16);
                                                awrmVar4 = awrmVar2;
                                                uwkVar2 = new uwk(awrmVar4, 17);
                                                while (r0.hasNext()) {
                                                    th2 = th2;
                                                    i4 = apksVar.b;
                                                    if ((i4 & 1) != 0) {
                                                        i5 = apksVar.c;
                                                        if (i5 != 0) {
                                                            i6 = 4;
                                                        } else if (i5 != i2) {
                                                            i6 = 1;
                                                        } else if (i5 != 4) {
                                                            i6 = 2;
                                                        } else if (i5 != 5) {
                                                            i6 = i3;
                                                        } else {
                                                            i6 = 3;
                                                        }
                                                        if (i6 != 0) {
                                                            throw th2;
                                                        }
                                                        i7 = i6 - 1;
                                                        if (i7 != 0) {
                                                            if (i7 != 1) {
                                                                if (i7 != 2) {
                                                                    if (i5 == 5) {
                                                                        BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                                    } else {
                                                                        BooleanValue = i3;
                                                                    }
                                                                    if (BooleanValue != 0) {
                                                                        String str13 = apksVar.e;
                                                                        str13.getClass();
                                                                        uwkVar2.invoke(str13);
                                                                    }
                                                                } else if (i7 != 3) {
                                                                    throw new awmj();
                                                                }
                                                            }
                                                            th2 = th2;
                                                            i2 = 2;
                                                        } else if ((i4 & 2) != 0) {
                                                            ajnvVar = apksVar.f;
                                                            if (ajnvVar == null) {
                                                                ajnvVar = ajnv.a;
                                                            }
                                                            ajnvVar.getClass();
                                                            map = tnmVar.e;
                                                            uwk uwkVar9 = uwkVar2;
                                                            awrmVar2 = awrmVar4;
                                                            wmnVar = wmnVar2;
                                                            long epochMilli7 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                            tmsVarA = tmt.a();
                                                            tmsVarA.f(epochMilli7);
                                                            tmsVarA.g(epochMilli7);
                                                            tmsVarA.e(j);
                                                            if (map == null) {
                                                                map = agpn.b;
                                                            }
                                                            tmsVarA.d(map);
                                                            if (true != ajnvVar.e) {
                                                                i8 = 1;
                                                            } else {
                                                                i8 = 2;
                                                            }
                                                            tmsVarA.d = i8;
                                                            if ((ajnvVar.b & 4) != 0) {
                                                                tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                            }
                                                            tmt tmtVarA7 = tmsVarA.a();
                                                            i2 = 2;
                                                            if (apksVar.c == 2) {
                                                                ajegVar = (ajeg) apksVar.d;
                                                            } else {
                                                                ajegVar = ajeg.a;
                                                            }
                                                            aifvVar = ajegVar.b;
                                                            if (aifvVar == null) {
                                                                aifvVar = aifv.a;
                                                            }
                                                            byte[] bArrG7 = aifvVar.c.G();
                                                            String str14 = apksVar.e;
                                                            str14.getClass();
                                                            uwkVar.invoke(new tne(bArrG7, tmtVarA7, str14));
                                                            uwkVar2 = uwkVar9;
                                                            wmnVar2 = wmnVar;
                                                            awrmVar4 = awrmVar2;
                                                        } else {
                                                            i2 = 2;
                                                        }
                                                    }
                                                    j = 0;
                                                }
                                                awrmVar2 = awrmVar4;
                                                wmnVar = wmnVar2;
                                                Throwable th18 = th2;
                                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                wmoVar = wmkVar2.a;
                                                if (wmoVar.c()) {
                                                    aigmVarT = wmoVar.a(iterable);
                                                } else {
                                                    if (iterable == tnmVar.c()) {
                                                        aigmVarT = tnmVar.b();
                                                    } else {
                                                        aigmVarT = aigm.T(iterable);
                                                    }
                                                    aigm aigmVar115 = aigmVarT;
                                                    MessageLite messageLite115 = wmkVar2.f;
                                                    zza zzaVar115 = wmkVar2.g;
                                                    final wmk r1110 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC115 = r1110.c(tnmVar, aigmVar115, messageLite115, zzaVar115, wkwVar);
                                                    JniZero.l(afuuVarC2, th18);
                                                    wmnVar.b();
                                                    listE = r1110.e(executor, wlzVarC115.a, r1110.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r1110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite116;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite116 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r1110.d.a(messageLite116);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r1110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite116;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite116 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r1110.d.a(messageLite116);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                }
                                                aigm aigmVar116 = aigmVarT;
                                                MessageLite messageLite116 = wmkVar2.f;
                                                zza zzaVar116 = wmkVar2.g;
                                                final wmk r1111 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC116 = r1111.c(tnmVar, aigmVar116, messageLite116, zzaVar116, wkwVar);
                                                JniZero.l(afuuVarC2, th18);
                                                wmnVar.b();
                                                listE = r1111.e(executor, wlzVarC116.a, r1111.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r1111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite117;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite117 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r1111.d.a(messageLite117);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r1111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite117;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite117 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r1111.d.a(messageLite117);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                wmnVar = wmnVar2;
                                                Throwable th19 = th2;
                                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                wmoVar = wmkVar2.a;
                                                if (wmoVar.c()) {
                                                    aigmVarT = wmoVar.a(iterable);
                                                } else {
                                                    if (iterable == tnmVar.c()) {
                                                        aigmVarT = tnmVar.b();
                                                    } else {
                                                        aigmVarT = aigm.T(iterable);
                                                    }
                                                    aigm aigmVar117 = aigmVarT;
                                                    MessageLite messageLite117 = wmkVar2.f;
                                                    zza zzaVar117 = wmkVar2.g;
                                                    final wmk r1112 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC117 = r1112.c(tnmVar, aigmVar117, messageLite117, zzaVar117, wkwVar);
                                                    JniZero.l(afuuVarC2, th19);
                                                    wmnVar.b();
                                                    listE = r1112.e(executor, wlzVarC117.a, r1112.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r1112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite118;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite118 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r1112.d.a(messageLite118);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r1112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite118;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite118 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r1112.d.a(messageLite118);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                }
                                                aigm aigmVar118 = aigmVarT;
                                                MessageLite messageLite118 = wmkVar2.f;
                                                zza zzaVar118 = wmkVar2.g;
                                                final wmk r1113 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC118 = r1113.c(tnmVar, aigmVar118, messageLite118, zzaVar118, wkwVar);
                                                JniZero.l(afuuVarC2, th19);
                                                wmnVar.b();
                                                listE = r1113.e(executor, wlzVarC118.a, r1113.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r1113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite119;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite119 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r1113.d.a(messageLite119);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r1113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite119;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite119 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r1113.d.a(messageLite119);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                            JniZero.l(afuuVar, null);
                                            return listenableFutureN;
                                        }
                                        r0 = xplVar.b;
                                        r25 = r0;
                                        if (iterableJ != null) {
                                            hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                        } else {
                                            hhoVar = null;
                                        }
                                        if (xplVar != null) {
                                            r30 = xplVar.a;
                                        } else {
                                            r30 = 0;
                                        }
                                        wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                        wmnVar2 = wmnVar;
                                        iterable = wmnVar2.a;
                                        if (wmnVar2.d == null) {
                                            z4 = false;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            xxjVar = new xxj(wmnVar2, null);
                                            afuuVarC3 = afwt.c(78, "processFutAsync");
                                            th2 = null;
                                            wmkVar2 = wmkVar;
                                            dovVar = wmkVar2.k;
                                            zwaVar = wmkVar2.e.u;
                                            if (dovVar.a.isEmpty()) {
                                                listenableFutureAq = aher.a;
                                                i2 = 2;
                                                i3 = 0;
                                            } else {
                                                i2 = 2;
                                                i3 = 0;
                                                listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                            }
                                            listenableFuture = listenableFutureAq;
                                            afuuVarC3.a(listenableFuture);
                                            JniZero.l(afuuVarC3, th2);
                                        } else {
                                            wmkVar2 = wmkVar;
                                            i2 = 2;
                                            th2 = null;
                                            i3 = 0;
                                            albeVarA = wmnVar2.a();
                                            if (albeVarA != null) {
                                                afuuVarC = afwt.c(79, "processFutAsync");
                                                ListenableFuture listenableFutureU8 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                                afuuVarC.a(listenableFutureU8);
                                                JniZero.l(afuuVarC, null);
                                                listenableFuture = listenableFutureU8;
                                            } else {
                                                listenableFuture = null;
                                            }
                                        }
                                        if (listenableFuture != null) {
                                            ArrayList arrayList13 = new ArrayList();
                                            arrayList13.add(listenableFuture);
                                            r10 = arrayList13;
                                        } else {
                                            r10 = th2;
                                        }
                                        apktVar2 = wmnVar2.b;
                                        if (apktVar2 != null) {
                                            uwkVar = new uwk(arrayList4, 16);
                                            awrmVar4 = awrmVar2;
                                            uwkVar2 = new uwk(awrmVar4, 17);
                                            while (r0.hasNext()) {
                                                th2 = th2;
                                                i4 = apksVar.b;
                                                if ((i4 & 1) != 0) {
                                                    i5 = apksVar.c;
                                                    if (i5 != 0) {
                                                        i6 = 4;
                                                    } else if (i5 != i2) {
                                                        i6 = 1;
                                                    } else if (i5 != 4) {
                                                        i6 = 2;
                                                    } else if (i5 != 5) {
                                                        i6 = i3;
                                                    } else {
                                                        i6 = 3;
                                                    }
                                                    if (i6 != 0) {
                                                        throw th2;
                                                    }
                                                    i7 = i6 - 1;
                                                    if (i7 != 0) {
                                                        if (i7 != 1) {
                                                            if (i7 != 2) {
                                                                if (i5 == 5) {
                                                                    BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                                } else {
                                                                    BooleanValue = i3;
                                                                }
                                                                if (BooleanValue != 0) {
                                                                    String str15 = apksVar.e;
                                                                    str15.getClass();
                                                                    uwkVar2.invoke(str15);
                                                                }
                                                            } else if (i7 != 3) {
                                                                throw new awmj();
                                                            }
                                                        }
                                                        th2 = th2;
                                                        i2 = 2;
                                                    } else if ((i4 & 2) != 0) {
                                                        ajnvVar = apksVar.f;
                                                        if (ajnvVar == null) {
                                                            ajnvVar = ajnv.a;
                                                        }
                                                        ajnvVar.getClass();
                                                        map = tnmVar.e;
                                                        uwk uwkVar10 = uwkVar2;
                                                        awrmVar2 = awrmVar4;
                                                        wmnVar = wmnVar2;
                                                        long epochMilli8 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                        tmsVarA = tmt.a();
                                                        tmsVarA.f(epochMilli8);
                                                        tmsVarA.g(epochMilli8);
                                                        tmsVarA.e(j);
                                                        if (map == null) {
                                                            map = agpn.b;
                                                        }
                                                        tmsVarA.d(map);
                                                        if (true != ajnvVar.e) {
                                                            i8 = 1;
                                                        } else {
                                                            i8 = 2;
                                                        }
                                                        tmsVarA.d = i8;
                                                        if ((ajnvVar.b & 4) != 0) {
                                                            tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                        }
                                                        tmt tmtVarA8 = tmsVarA.a();
                                                        i2 = 2;
                                                        if (apksVar.c == 2) {
                                                            ajegVar = (ajeg) apksVar.d;
                                                        } else {
                                                            ajegVar = ajeg.a;
                                                        }
                                                        aifvVar = ajegVar.b;
                                                        if (aifvVar == null) {
                                                            aifvVar = aifv.a;
                                                        }
                                                        byte[] bArrG8 = aifvVar.c.G();
                                                        String str16 = apksVar.e;
                                                        str16.getClass();
                                                        uwkVar.invoke(new tne(bArrG8, tmtVarA8, str16));
                                                        uwkVar2 = uwkVar10;
                                                        wmnVar2 = wmnVar;
                                                        awrmVar4 = awrmVar2;
                                                    } else {
                                                        i2 = 2;
                                                    }
                                                }
                                                j = 0;
                                            }
                                            awrmVar2 = awrmVar4;
                                            wmnVar = wmnVar2;
                                            Throwable th110 = th2;
                                            afuuVarC2 = afwt.c(84, "parseResponseProto");
                                            wmoVar = wmkVar2.a;
                                            if (wmoVar.c()) {
                                                aigmVarT = wmoVar.a(iterable);
                                            } else {
                                                if (iterable == tnmVar.c()) {
                                                    aigmVarT = tnmVar.b();
                                                } else {
                                                    aigmVarT = aigm.T(iterable);
                                                }
                                                aigm aigmVar119 = aigmVarT;
                                                MessageLite messageLite119 = wmkVar2.f;
                                                zza zzaVar119 = wmkVar2.g;
                                                final wmk r1114 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC119 = r1114.c(tnmVar, aigmVar119, messageLite119, zzaVar119, wkwVar);
                                                JniZero.l(afuuVarC2, th110);
                                                wmnVar.b();
                                                listE = r1114.e(executor, wlzVarC119.a, r1114.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r1114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite1110;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite1110 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r1114.d.a(messageLite1110);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r1114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite1110;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite1110 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r1114.d.a(messageLite1110);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                            aigm aigmVar1110 = aigmVarT;
                                            MessageLite messageLite1110 = wmkVar2.f;
                                            zza zzaVar1110 = wmkVar2.g;
                                            final wmk r1115 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC1110 = r1115.c(tnmVar, aigmVar1110, messageLite1110, zzaVar1110, wkwVar);
                                            JniZero.l(afuuVarC2, th110);
                                            wmnVar.b();
                                            listE = r1115.e(executor, wlzVarC1110.a, r1115.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r1115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite1111;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite1111 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r1115.d.a(messageLite1111);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r1115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite1111;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite1111 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r1115.d.a(messageLite1111);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            wmnVar = wmnVar2;
                                            Throwable th111 = th2;
                                            afuuVarC2 = afwt.c(84, "parseResponseProto");
                                            wmoVar = wmkVar2.a;
                                            if (wmoVar.c()) {
                                                aigmVarT = wmoVar.a(iterable);
                                            } else {
                                                if (iterable == tnmVar.c()) {
                                                    aigmVarT = tnmVar.b();
                                                } else {
                                                    aigmVarT = aigm.T(iterable);
                                                }
                                                aigm aigmVar1111 = aigmVarT;
                                                MessageLite messageLite1111 = wmkVar2.f;
                                                zza zzaVar1111 = wmkVar2.g;
                                                final wmk r1116 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC1111 = r1116.c(tnmVar, aigmVar1111, messageLite1111, zzaVar1111, wkwVar);
                                                JniZero.l(afuuVarC2, th111);
                                                wmnVar.b();
                                                listE = r1116.e(executor, wlzVarC1111.a, r1116.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r1116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite1112;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite1112 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r1116.d.a(messageLite1112);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r1116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite1112;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite1112 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r1116.d.a(messageLite1112);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                            aigm aigmVar1112 = aigmVarT;
                                            MessageLite messageLite1112 = wmkVar2.f;
                                            zza zzaVar1112 = wmkVar2.g;
                                            final wmk r1117 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC1112 = r1117.c(tnmVar, aigmVar1112, messageLite1112, zzaVar1112, wkwVar);
                                            JniZero.l(afuuVarC2, th111);
                                            wmnVar.b();
                                            listE = r1117.e(executor, wlzVarC1112.a, r1117.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r1117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite1113;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite1113 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r1117.d.a(messageLite1113);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r1117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite1113;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite1113 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r1117.d.a(messageLite1113);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        }
                                        JniZero.l(afuuVar, null);
                                        return listenableFutureN;
                                    }
                                    wmkVar = wmkVar3;
                                    z3 = z5;
                                    awrmVar2 = awrmVar5;
                                    afuuVar = afuuVarC4;
                                    arrayList2 = arrayList5;
                                    j = 0;
                                    xplVar = null;
                                    if (xplVar == null) {
                                        r0 = C;
                                        if (!arrayList.isEmpty()) {
                                            arrayList3 = new ArrayList(C.size() + arrayList.size());
                                            it = arrayList.iterator();
                                            if (it.hasNext()) {
                                                wmmVar = (wmm) it.next();
                                            } else {
                                                wmmVar = null;
                                            }
                                            j2 = j;
                                            while (r0.hasNext()) {
                                                long jRemaining5 = ((long) byteBuffer2.remaining()) + j2;
                                                if (wmmVar != null) {
                                                    it2 = it;
                                                    arrayList3.add(byteBuffer2.duplicate());
                                                } else {
                                                    it2 = it;
                                                    arrayList3.add(byteBuffer2.duplicate());
                                                }
                                                j2 = jRemaining5;
                                                it = it2;
                                            }
                                            r25 = arrayList3;
                                        }
                                        if (iterableJ != null) {
                                            hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                        } else {
                                            hhoVar = null;
                                        }
                                        if (xplVar != null) {
                                            r30 = xplVar.a;
                                        } else {
                                            r30 = 0;
                                        }
                                        wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                        wmnVar2 = wmnVar;
                                        iterable = wmnVar2.a;
                                        if (wmnVar2.d == null) {
                                            z4 = false;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            xxjVar = new xxj(wmnVar2, null);
                                            afuuVarC3 = afwt.c(78, "processFutAsync");
                                            th2 = null;
                                            wmkVar2 = wmkVar;
                                            dovVar = wmkVar2.k;
                                            zwaVar = wmkVar2.e.u;
                                            if (dovVar.a.isEmpty()) {
                                                listenableFutureAq = aher.a;
                                                i2 = 2;
                                                i3 = 0;
                                            } else {
                                                i2 = 2;
                                                i3 = 0;
                                                listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                            }
                                            listenableFuture = listenableFutureAq;
                                            afuuVarC3.a(listenableFuture);
                                            JniZero.l(afuuVarC3, th2);
                                        } else {
                                            wmkVar2 = wmkVar;
                                            i2 = 2;
                                            th2 = null;
                                            i3 = 0;
                                            albeVarA = wmnVar2.a();
                                            if (albeVarA != null) {
                                                afuuVarC = afwt.c(79, "processFutAsync");
                                                ListenableFuture listenableFutureU9 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                                afuuVarC.a(listenableFutureU9);
                                                JniZero.l(afuuVarC, null);
                                                listenableFuture = listenableFutureU9;
                                            } else {
                                                listenableFuture = null;
                                            }
                                        }
                                        if (listenableFuture != null) {
                                            ArrayList arrayList14 = new ArrayList();
                                            arrayList14.add(listenableFuture);
                                            r10 = arrayList14;
                                        } else {
                                            r10 = th2;
                                        }
                                        apktVar2 = wmnVar2.b;
                                        if (apktVar2 != null) {
                                            uwkVar = new uwk(arrayList4, 16);
                                            awrmVar4 = awrmVar2;
                                            uwkVar2 = new uwk(awrmVar4, 17);
                                            while (r0.hasNext()) {
                                                th2 = th2;
                                                i4 = apksVar.b;
                                                if ((i4 & 1) != 0) {
                                                    i5 = apksVar.c;
                                                    if (i5 != 0) {
                                                        i6 = 4;
                                                    } else if (i5 != i2) {
                                                        i6 = 1;
                                                    } else if (i5 != 4) {
                                                        i6 = 2;
                                                    } else if (i5 != 5) {
                                                        i6 = i3;
                                                    } else {
                                                        i6 = 3;
                                                    }
                                                    if (i6 != 0) {
                                                        throw th2;
                                                    }
                                                    i7 = i6 - 1;
                                                    if (i7 != 0) {
                                                        if (i7 != 1) {
                                                            if (i7 != 2) {
                                                                if (i5 == 5) {
                                                                    BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                                } else {
                                                                    BooleanValue = i3;
                                                                }
                                                                if (BooleanValue != 0) {
                                                                    String str17 = apksVar.e;
                                                                    str17.getClass();
                                                                    uwkVar2.invoke(str17);
                                                                }
                                                            } else if (i7 != 3) {
                                                                throw new awmj();
                                                            }
                                                        }
                                                        th2 = th2;
                                                        i2 = 2;
                                                    } else if ((i4 & 2) != 0) {
                                                        ajnvVar = apksVar.f;
                                                        if (ajnvVar == null) {
                                                            ajnvVar = ajnv.a;
                                                        }
                                                        ajnvVar.getClass();
                                                        map = tnmVar.e;
                                                        uwk uwkVar11 = uwkVar2;
                                                        awrmVar2 = awrmVar4;
                                                        wmnVar = wmnVar2;
                                                        long epochMilli9 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                        tmsVarA = tmt.a();
                                                        tmsVarA.f(epochMilli9);
                                                        tmsVarA.g(epochMilli9);
                                                        tmsVarA.e(j);
                                                        if (map == null) {
                                                            map = agpn.b;
                                                        }
                                                        tmsVarA.d(map);
                                                        if (true != ajnvVar.e) {
                                                            i8 = 1;
                                                        } else {
                                                            i8 = 2;
                                                        }
                                                        tmsVarA.d = i8;
                                                        if ((ajnvVar.b & 4) != 0) {
                                                            tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                        }
                                                        tmt tmtVarA9 = tmsVarA.a();
                                                        i2 = 2;
                                                        if (apksVar.c == 2) {
                                                            ajegVar = (ajeg) apksVar.d;
                                                        } else {
                                                            ajegVar = ajeg.a;
                                                        }
                                                        aifvVar = ajegVar.b;
                                                        if (aifvVar == null) {
                                                            aifvVar = aifv.a;
                                                        }
                                                        byte[] bArrG9 = aifvVar.c.G();
                                                        String str18 = apksVar.e;
                                                        str18.getClass();
                                                        uwkVar.invoke(new tne(bArrG9, tmtVarA9, str18));
                                                        uwkVar2 = uwkVar11;
                                                        wmnVar2 = wmnVar;
                                                        awrmVar4 = awrmVar2;
                                                    } else {
                                                        i2 = 2;
                                                    }
                                                }
                                                j = 0;
                                            }
                                            awrmVar2 = awrmVar4;
                                            wmnVar = wmnVar2;
                                            Throwable th112 = th2;
                                            afuuVarC2 = afwt.c(84, "parseResponseProto");
                                            wmoVar = wmkVar2.a;
                                            if (wmoVar.c()) {
                                                aigmVarT = wmoVar.a(iterable);
                                            } else {
                                                if (iterable == tnmVar.c()) {
                                                    aigmVarT = tnmVar.b();
                                                } else {
                                                    aigmVarT = aigm.T(iterable);
                                                }
                                                aigm aigmVar1113 = aigmVarT;
                                                MessageLite messageLite1113 = wmkVar2.f;
                                                zza zzaVar1113 = wmkVar2.g;
                                                final wmk r1118 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC1113 = r1118.c(tnmVar, aigmVar1113, messageLite1113, zzaVar1113, wkwVar);
                                                JniZero.l(afuuVarC2, th112);
                                                wmnVar.b();
                                                listE = r1118.e(executor, wlzVarC1113.a, r1118.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r1118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite1114;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite1114 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r1118.d.a(messageLite1114);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r1118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite1114;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite1114 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r1118.d.a(messageLite1114);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                            aigm aigmVar1114 = aigmVarT;
                                            MessageLite messageLite1114 = wmkVar2.f;
                                            zza zzaVar1114 = wmkVar2.g;
                                            final wmk r1119 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC1114 = r1119.c(tnmVar, aigmVar1114, messageLite1114, zzaVar1114, wkwVar);
                                            JniZero.l(afuuVarC2, th112);
                                            wmnVar.b();
                                            listE = r1119.e(executor, wlzVarC1114.a, r1119.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r1119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite1115;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite1115 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r1119.d.a(messageLite1115);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r1119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite1115;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite1115 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r1119.d.a(messageLite1115);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            wmnVar = wmnVar2;
                                            Throwable th113 = th2;
                                            afuuVarC2 = afwt.c(84, "parseResponseProto");
                                            wmoVar = wmkVar2.a;
                                            if (wmoVar.c()) {
                                                aigmVarT = wmoVar.a(iterable);
                                            } else {
                                                if (iterable == tnmVar.c()) {
                                                    aigmVarT = tnmVar.b();
                                                } else {
                                                    aigmVarT = aigm.T(iterable);
                                                }
                                                aigm aigmVar1115 = aigmVarT;
                                                MessageLite messageLite1115 = wmkVar2.f;
                                                zza zzaVar1115 = wmkVar2.g;
                                                final wmk r11110 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC1115 = r11110.c(tnmVar, aigmVar1115, messageLite1115, zzaVar1115, wkwVar);
                                                JniZero.l(afuuVarC2, th113);
                                                wmnVar.b();
                                                listE = r11110.e(executor, wlzVarC1115.a, r11110.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r11110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite1116;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite1116 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r11110.d.a(messageLite1116);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r11110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite1116;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite1116 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r11110.d.a(messageLite1116);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                            aigm aigmVar1116 = aigmVarT;
                                            MessageLite messageLite1116 = wmkVar2.f;
                                            zza zzaVar1116 = wmkVar2.g;
                                            final wmk r11111 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC1116 = r11111.c(tnmVar, aigmVar1116, messageLite1116, zzaVar1116, wkwVar);
                                            JniZero.l(afuuVarC2, th113);
                                            wmnVar.b();
                                            listE = r11111.e(executor, wlzVarC1116.a, r11111.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r11111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite1117;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite1117 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r11111.d.a(messageLite1117);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r11111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite1117;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite1117 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r11111.d.a(messageLite1117);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        }
                                        JniZero.l(afuuVar, null);
                                        return listenableFutureN;
                                    }
                                    r0 = xplVar.b;
                                    r25 = r0;
                                    if (iterableJ != null) {
                                        hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                    } else {
                                        hhoVar = null;
                                    }
                                    if (xplVar != null) {
                                        r30 = xplVar.a;
                                    } else {
                                        r30 = 0;
                                    }
                                    wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                    wmnVar2 = wmnVar;
                                    iterable = wmnVar2.a;
                                    if (wmnVar2.d == null) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        xxjVar = new xxj(wmnVar2, null);
                                        afuuVarC3 = afwt.c(78, "processFutAsync");
                                        th2 = null;
                                        wmkVar2 = wmkVar;
                                        dovVar = wmkVar2.k;
                                        zwaVar = wmkVar2.e.u;
                                        if (dovVar.a.isEmpty()) {
                                            listenableFutureAq = aher.a;
                                            i2 = 2;
                                            i3 = 0;
                                        } else {
                                            i2 = 2;
                                            i3 = 0;
                                            listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                        }
                                        listenableFuture = listenableFutureAq;
                                        afuuVarC3.a(listenableFuture);
                                        JniZero.l(afuuVarC3, th2);
                                    } else {
                                        wmkVar2 = wmkVar;
                                        i2 = 2;
                                        th2 = null;
                                        i3 = 0;
                                        albeVarA = wmnVar2.a();
                                        if (albeVarA != null) {
                                            afuuVarC = afwt.c(79, "processFutAsync");
                                            ListenableFuture listenableFutureU10 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                            afuuVarC.a(listenableFutureU10);
                                            JniZero.l(afuuVarC, null);
                                            listenableFuture = listenableFutureU10;
                                        } else {
                                            listenableFuture = null;
                                        }
                                    }
                                    if (listenableFuture != null) {
                                        ArrayList arrayList15 = new ArrayList();
                                        arrayList15.add(listenableFuture);
                                        r10 = arrayList15;
                                    } else {
                                        r10 = th2;
                                    }
                                    apktVar2 = wmnVar2.b;
                                    if (apktVar2 != null) {
                                        uwkVar = new uwk(arrayList4, 16);
                                        awrmVar4 = awrmVar2;
                                        uwkVar2 = new uwk(awrmVar4, 17);
                                        while (r0.hasNext()) {
                                            th2 = th2;
                                            i4 = apksVar.b;
                                            if ((i4 & 1) != 0) {
                                                i5 = apksVar.c;
                                                if (i5 != 0) {
                                                    i6 = 4;
                                                } else if (i5 != i2) {
                                                    i6 = 1;
                                                } else if (i5 != 4) {
                                                    i6 = 2;
                                                } else if (i5 != 5) {
                                                    i6 = i3;
                                                } else {
                                                    i6 = 3;
                                                }
                                                if (i6 != 0) {
                                                    throw th2;
                                                }
                                                i7 = i6 - 1;
                                                if (i7 != 0) {
                                                    if (i7 != 1) {
                                                        if (i7 != 2) {
                                                            if (i5 == 5) {
                                                                BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                            } else {
                                                                BooleanValue = i3;
                                                            }
                                                            if (BooleanValue != 0) {
                                                                String str19 = apksVar.e;
                                                                str19.getClass();
                                                                uwkVar2.invoke(str19);
                                                            }
                                                        } else if (i7 != 3) {
                                                            throw new awmj();
                                                        }
                                                    }
                                                    th2 = th2;
                                                    i2 = 2;
                                                } else if ((i4 & 2) != 0) {
                                                    ajnvVar = apksVar.f;
                                                    if (ajnvVar == null) {
                                                        ajnvVar = ajnv.a;
                                                    }
                                                    ajnvVar.getClass();
                                                    map = tnmVar.e;
                                                    uwk uwkVar12 = uwkVar2;
                                                    awrmVar2 = awrmVar4;
                                                    wmnVar = wmnVar2;
                                                    long epochMilli10 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                    tmsVarA = tmt.a();
                                                    tmsVarA.f(epochMilli10);
                                                    tmsVarA.g(epochMilli10);
                                                    tmsVarA.e(j);
                                                    if (map == null) {
                                                        map = agpn.b;
                                                    }
                                                    tmsVarA.d(map);
                                                    if (true != ajnvVar.e) {
                                                        i8 = 1;
                                                    } else {
                                                        i8 = 2;
                                                    }
                                                    tmsVarA.d = i8;
                                                    if ((ajnvVar.b & 4) != 0) {
                                                        tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                    }
                                                    tmt tmtVarA10 = tmsVarA.a();
                                                    i2 = 2;
                                                    if (apksVar.c == 2) {
                                                        ajegVar = (ajeg) apksVar.d;
                                                    } else {
                                                        ajegVar = ajeg.a;
                                                    }
                                                    aifvVar = ajegVar.b;
                                                    if (aifvVar == null) {
                                                        aifvVar = aifv.a;
                                                    }
                                                    byte[] bArrG10 = aifvVar.c.G();
                                                    String str110 = apksVar.e;
                                                    str110.getClass();
                                                    uwkVar.invoke(new tne(bArrG10, tmtVarA10, str110));
                                                    uwkVar2 = uwkVar12;
                                                    wmnVar2 = wmnVar;
                                                    awrmVar4 = awrmVar2;
                                                } else {
                                                    i2 = 2;
                                                }
                                            }
                                            j = 0;
                                        }
                                        awrmVar2 = awrmVar4;
                                        wmnVar = wmnVar2;
                                        Throwable th114 = th2;
                                        afuuVarC2 = afwt.c(84, "parseResponseProto");
                                        wmoVar = wmkVar2.a;
                                        if (wmoVar.c()) {
                                            aigmVarT = wmoVar.a(iterable);
                                        } else {
                                            if (iterable == tnmVar.c()) {
                                                aigmVarT = tnmVar.b();
                                            } else {
                                                aigmVarT = aigm.T(iterable);
                                            }
                                            aigm aigmVar1117 = aigmVarT;
                                            MessageLite messageLite1117 = wmkVar2.f;
                                            zza zzaVar1117 = wmkVar2.g;
                                            final wmk r11112 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC1117 = r11112.c(tnmVar, aigmVar1117, messageLite1117, zzaVar1117, wkwVar);
                                            JniZero.l(afuuVarC2, th114);
                                            wmnVar.b();
                                            listE = r11112.e(executor, wlzVarC1117.a, r11112.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r11112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite1118;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite1118 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r11112.d.a(messageLite1118);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r11112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite1118;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite1118 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r11112.d.a(messageLite1118);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        }
                                        aigm aigmVar1118 = aigmVarT;
                                        MessageLite messageLite1118 = wmkVar2.f;
                                        zza zzaVar1118 = wmkVar2.g;
                                        final wmk r11113 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC1118 = r11113.c(tnmVar, aigmVar1118, messageLite1118, zzaVar1118, wkwVar);
                                        JniZero.l(afuuVarC2, th114);
                                        wmnVar.b();
                                        listE = r11113.e(executor, wlzVarC1118.a, r11113.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r11113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite1119;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite1119 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r11113.d.a(messageLite1119);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r11113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite1119;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite1119 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r11113.d.a(messageLite1119);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        wmnVar = wmnVar2;
                                        Throwable th115 = th2;
                                        afuuVarC2 = afwt.c(84, "parseResponseProto");
                                        wmoVar = wmkVar2.a;
                                        if (wmoVar.c()) {
                                            aigmVarT = wmoVar.a(iterable);
                                        } else {
                                            if (iterable == tnmVar.c()) {
                                                aigmVarT = tnmVar.b();
                                            } else {
                                                aigmVarT = aigm.T(iterable);
                                            }
                                            aigm aigmVar1119 = aigmVarT;
                                            MessageLite messageLite1119 = wmkVar2.f;
                                            zza zzaVar1119 = wmkVar2.g;
                                            final wmk r11114 = wmkVar2;
                                            awrmVar3 = awrmVar2;
                                            wlz wlzVarC1119 = r11114.c(tnmVar, aigmVar1119, messageLite1119, zzaVar1119, wkwVar);
                                            JniZero.l(afuuVarC2, th115);
                                            wmnVar.b();
                                            listE = r11114.e(executor, wlzVarC1119.a, r11114.e.u);
                                            if (r10 == 0) {
                                                if (listE.isEmpty()) {
                                                    r11 = awno.a;
                                                } else {
                                                    r3 = listE;
                                                }
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r11114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite11110;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite11110 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r11114.d.a(messageLite11110);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                r10.addAll(listE);
                                                r11 = r10;
                                            }
                                            r3 = r11;
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r11114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite11110;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite11110 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r11114.d.a(messageLite11110);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        }
                                        aigm aigmVar11110 = aigmVarT;
                                        MessageLite messageLite11110 = wmkVar2.f;
                                        zza zzaVar11110 = wmkVar2.g;
                                        final wmk r11115 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC11110 = r11115.c(tnmVar, aigmVar11110, messageLite11110, zzaVar11110, wkwVar);
                                        JniZero.l(afuuVarC2, th115);
                                        wmnVar.b();
                                        listE = r11115.e(executor, wlzVarC11110.a, r11115.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r11115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite11111;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite11111 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r11115.d.a(messageLite11111);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r11115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite11111;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite11111 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r11115.d.a(messageLite11111);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    }
                                    JniZero.l(afuuVar, null);
                                    return listenableFutureN;
                                }
                                wmkVar = wmkVar3;
                                z3 = z5;
                                awrmVar2 = awrmVar5;
                                afuuVar = afuuVarC4;
                                arrayList2 = arrayList5;
                                j = 0;
                                xplVar = null;
                                try {
                                    try {
                                        try {
                                            if (xplVar == null) {
                                                try {
                                                    r0 = C;
                                                    if (!arrayList.isEmpty()) {
                                                        arrayList3 = new ArrayList(C.size() + arrayList.size());
                                                        it = arrayList.iterator();
                                                        if (it.hasNext()) {
                                                            wmmVar = (wmm) it.next();
                                                        } else {
                                                            wmmVar = null;
                                                        }
                                                        j2 = j;
                                                        while (r0.hasNext()) {
                                                            long jRemaining6 = ((long) byteBuffer2.remaining()) + j2;
                                                            if (wmmVar != null || jRemaining6 <= wmmVar.a) {
                                                                it2 = it;
                                                                arrayList3.add(byteBuffer2.duplicate());
                                                            } else {
                                                                awrl awrlVar = new awrl();
                                                                awrlVar.a = j2;
                                                                awrk awrkVar = new awrk();
                                                                awrkVar.a = byteBuffer2.position();
                                                                while (true) {
                                                                    long j8 = awrlVar.a;
                                                                    if (j8 >= jRemaining6) {
                                                                        break;
                                                                    }
                                                                    if (j8 >= wmmVar.b) {
                                                                        wmmVar = it.hasNext() ? (wmm) it.next() : null;
                                                                    }
                                                                    long j9 = awrlVar.a;
                                                                    if (wmmVar == null) {
                                                                        wmo.b(byteBuffer2, awrkVar, arrayList3, awrlVar, (int) (jRemaining6 - j9));
                                                                        break;
                                                                    }
                                                                    long j10 = wmmVar.a;
                                                                    if (j9 < j10) {
                                                                        wmo.b(byteBuffer2, awrkVar, arrayList3, awrlVar, (int) (Math.min(jRemaining6, j10) - awrlVar.a));
                                                                    } else {
                                                                        if (j9 == j10 && (byteBuffer = wmmVar.c) != null) {
                                                                            arrayList3.add(byteBuffer);
                                                                        }
                                                                        long jMin = Math.min(jRemaining6, wmmVar.b);
                                                                        long j11 = awrlVar.a;
                                                                        int i18 = (int) (jMin - j11);
                                                                        awrkVar.a += i18;
                                                                        awrlVar.a = j11 + ((long) i18);
                                                                    }
                                                                    byteBuffer2 = byteBuffer2;
                                                                    it = it;
                                                                }
                                                                it2 = it;
                                                            }
                                                            j2 = jRemaining6;
                                                            it = it2;
                                                        }
                                                        r25 = arrayList3;
                                                    }
                                                    if (iterableJ != null) {
                                                        hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                                    } else {
                                                        hhoVar = null;
                                                    }
                                                    if (xplVar != null) {
                                                        r30 = xplVar.a;
                                                    } else {
                                                        r30 = 0;
                                                    }
                                                    wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                                    wmnVar2 = wmnVar;
                                                    iterable = wmnVar2.a;
                                                    if (wmnVar2.d == null || wmnVar2.c == null) {
                                                        z4 = false;
                                                    } else {
                                                        z4 = true;
                                                    }
                                                    if (z4) {
                                                        xxjVar = new xxj(wmnVar2, null);
                                                        afuuVarC3 = afwt.c(78, "processFutAsync");
                                                        th2 = null;
                                                        wmkVar2 = wmkVar;
                                                        try {
                                                            dovVar = wmkVar2.k;
                                                            zwaVar = wmkVar2.e.u;
                                                            if (dovVar.a.isEmpty()) {
                                                                listenableFutureAq = aher.a;
                                                                i2 = 2;
                                                                i3 = 0;
                                                            } else {
                                                                i2 = 2;
                                                                i3 = 0;
                                                                listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                                            }
                                                            listenableFuture = listenableFutureAq;
                                                            afuuVarC3.a(listenableFuture);
                                                            JniZero.l(afuuVarC3, th2);
                                                        } catch (Throwable th20) {
                                                            try {
                                                                throw th20;
                                                            } catch (Throwable th21) {
                                                                JniZero.l(afuuVarC3, th20);
                                                                throw th21;
                                                            }
                                                        }
                                                    } else {
                                                        wmkVar2 = wmkVar;
                                                        i2 = 2;
                                                        th2 = null;
                                                        i3 = 0;
                                                        albeVarA = wmnVar2.a();
                                                        if (albeVarA != null) {
                                                            afuuVarC = afwt.c(79, "processFutAsync");
                                                            try {
                                                                ListenableFuture listenableFutureU11 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                                                afuuVarC.a(listenableFutureU11);
                                                                JniZero.l(afuuVarC, null);
                                                                listenableFuture = listenableFutureU11;
                                                            } catch (Throwable th22) {
                                                                try {
                                                                    throw th22;
                                                                } catch (Throwable th23) {
                                                                    JniZero.l(afuuVarC, th22);
                                                                    throw th23;
                                                                }
                                                            }
                                                        } else {
                                                            listenableFuture = null;
                                                        }
                                                    }
                                                    if (listenableFuture != null) {
                                                        ArrayList arrayList16 = new ArrayList();
                                                        arrayList16.add(listenableFuture);
                                                        r10 = arrayList16;
                                                    } else {
                                                        r10 = th2;
                                                    }
                                                    apktVar2 = wmnVar2.b;
                                                    if (apktVar2 != null) {
                                                        uwkVar = new uwk(arrayList4, 16);
                                                        awrmVar4 = awrmVar2;
                                                        try {
                                                            uwkVar2 = new uwk(awrmVar4, 17);
                                                            while (r0.hasNext()) {
                                                                th2 = th2;
                                                                i4 = apksVar.b;
                                                                if ((i4 & 1) != 0) {
                                                                    i5 = apksVar.c;
                                                                    if (i5 != 0) {
                                                                        i6 = 4;
                                                                    } else if (i5 != i2) {
                                                                        i6 = 1;
                                                                    } else if (i5 != 4) {
                                                                        i6 = 2;
                                                                    } else if (i5 != 5) {
                                                                        i6 = i3;
                                                                    } else {
                                                                        i6 = 3;
                                                                    }
                                                                    if (i6 != 0) {
                                                                        throw th2;
                                                                    }
                                                                    i7 = i6 - 1;
                                                                    if (i7 != 0) {
                                                                        if (i7 != 1) {
                                                                            if (i7 != 2) {
                                                                                if (i5 == 5) {
                                                                                    try {
                                                                                        BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                                                    } catch (aiik e3) {
                                                                                        e = e3;
                                                                                        awrmVar3 = awrmVar4;
                                                                                        wmnVar = wmnVar2;
                                                                                        afuuVar = afuuVar;
                                                                                        twu.c(6, "Failed while attempting to deserialize network response", e);
                                                                                        tnx tnxVarD3 = tnx.d(new tnp(e));
                                                                                        list2 = (List) awrmVar3.a;
                                                                                        if (list2 == null) {
                                                                                            list2 = awno.a;
                                                                                        }
                                                                                        listenableFutureN = ahng.n(new tnq(tnxVarD3, arrayList4, list2, 8));
                                                                                        wmnVar.b();
                                                                                        JniZero.l(afuuVar, null);
                                                                                        return listenableFutureN;
                                                                                    }
                                                                                } else {
                                                                                    BooleanValue = i3;
                                                                                }
                                                                                if (BooleanValue != 0) {
                                                                                    String str111 = apksVar.e;
                                                                                    str111.getClass();
                                                                                    uwkVar2.invoke(str111);
                                                                                }
                                                                            } else if (i7 != 3) {
                                                                                throw new awmj();
                                                                            }
                                                                        }
                                                                        th2 = th2;
                                                                        i2 = 2;
                                                                    } else if ((i4 & 2) != 0) {
                                                                        ajnvVar = apksVar.f;
                                                                        if (ajnvVar == null) {
                                                                            ajnvVar = ajnv.a;
                                                                        }
                                                                        ajnvVar.getClass();
                                                                        map = tnmVar.e;
                                                                        uwk uwkVar13 = uwkVar2;
                                                                        awrmVar2 = awrmVar4;
                                                                        wmnVar = wmnVar2;
                                                                        try {
                                                                            try {
                                                                                long epochMilli11 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                                                tmsVarA = tmt.a();
                                                                                tmsVarA.f(epochMilli11);
                                                                                tmsVarA.g(epochMilli11);
                                                                                tmsVarA.e(j);
                                                                                if (map == null) {
                                                                                    map = agpn.b;
                                                                                }
                                                                                tmsVarA.d(map);
                                                                                if (true != ajnvVar.e) {
                                                                                    i8 = 1;
                                                                                } else {
                                                                                    i8 = 2;
                                                                                }
                                                                                tmsVarA.d = i8;
                                                                                if ((ajnvVar.b & 4) != 0) {
                                                                                    tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                                                }
                                                                                tmt tmtVarA11 = tmsVarA.a();
                                                                                i2 = 2;
                                                                                if (apksVar.c == 2) {
                                                                                    ajegVar = (ajeg) apksVar.d;
                                                                                } else {
                                                                                    ajegVar = ajeg.a;
                                                                                }
                                                                                aifvVar = ajegVar.b;
                                                                                if (aifvVar == null) {
                                                                                    aifvVar = aifv.a;
                                                                                }
                                                                                byte[] bArrG11 = aifvVar.c.G();
                                                                                String str112 = apksVar.e;
                                                                                str112.getClass();
                                                                                uwkVar.invoke(new tne(bArrG11, tmtVarA11, str112));
                                                                                uwkVar2 = uwkVar13;
                                                                                wmnVar2 = wmnVar;
                                                                                awrmVar4 = awrmVar2;
                                                                            } catch (Throwable th24) {
                                                                                th = th24;
                                                                                wmnVar.b();
                                                                                throw th;
                                                                            }
                                                                        } catch (aiik e4) {
                                                                            e = e4;
                                                                        }
                                                                    } else {
                                                                        i2 = 2;
                                                                    }
                                                                }
                                                                j = 0;
                                                            }
                                                            awrmVar2 = awrmVar4;
                                                            wmnVar = wmnVar2;
                                                            Throwable th116 = th2;
                                                            afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                            try {
                                                                wmoVar = wmkVar2.a;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (wmoVar.c()) {
                                                                                aigmVarT = wmoVar.a(iterable);
                                                                            } else {
                                                                                if (iterable == tnmVar.c()) {
                                                                                    aigmVarT = tnmVar.b();
                                                                                } else {
                                                                                    aigmVarT = aigm.T(iterable);
                                                                                }
                                                                                aigm aigmVar11111 = aigmVarT;
                                                                                MessageLite messageLite11111 = wmkVar2.f;
                                                                                zza zzaVar11111 = wmkVar2.g;
                                                                                final wmk r11116 = wmkVar2;
                                                                                awrmVar3 = awrmVar2;
                                                                                wlz wlzVarC11111 = r11116.c(tnmVar, aigmVar11111, messageLite11111, zzaVar11111, wkwVar);
                                                                                JniZero.l(afuuVarC2, th116);
                                                                                wmnVar.b();
                                                                                listE = r11116.e(executor, wlzVarC11111.a, r11116.e.u);
                                                                                if (r10 == 0) {
                                                                                    if (listE.isEmpty()) {
                                                                                        r11 = awno.a;
                                                                                    } else {
                                                                                        r3 = listE;
                                                                                    }
                                                                                    list3 = (List) awrmVar3.a;
                                                                                    if (list3 == null) {
                                                                                        list3 = awno.a;
                                                                                    }
                                                                                    afuuVar = afuuVar;
                                                                                    listenableFutureN = r11116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                                                        @Override // defpackage.awql
                                                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                                            MessageLite messageLite11112;
                                                                                            tnx tnxVar = (tnx) obj2;
                                                                                            List list4 = (List) obj3;
                                                                                            List list5 = (List) obj4;
                                                                                            tnxVar.getClass();
                                                                                            list4.getClass();
                                                                                            list5.getClass();
                                                                                            boolean z7 = false;
                                                                                            if (tnxVar.h() && (messageLite11112 = (MessageLite) tnxVar.c().a) != null) {
                                                                                                alop alopVar = (alop) r11116.d.a(messageLite11112);
                                                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                                                    z7 = true;
                                                                                                }
                                                                                            }
                                                                                            return new tnq(tnxVar, list4, list5, z7);
                                                                                        }
                                                                                    });
                                                                                    afuuVar.a(listenableFutureN);
                                                                                } else {
                                                                                    r10.addAll(listE);
                                                                                    r11 = r10;
                                                                                }
                                                                                r3 = r11;
                                                                                list3 = (List) awrmVar3.a;
                                                                                if (list3 == null) {
                                                                                    list3 = awno.a;
                                                                                }
                                                                                afuuVar = afuuVar;
                                                                                listenableFutureN = r11116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                                                    @Override // defpackage.awql
                                                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                                        MessageLite messageLite11112;
                                                                                        tnx tnxVar = (tnx) obj2;
                                                                                        List list4 = (List) obj3;
                                                                                        List list5 = (List) obj4;
                                                                                        tnxVar.getClass();
                                                                                        list4.getClass();
                                                                                        list5.getClass();
                                                                                        boolean z7 = false;
                                                                                        if (tnxVar.h() && (messageLite11112 = (MessageLite) tnxVar.c().a) != null) {
                                                                                            alop alopVar = (alop) r11116.d.a(messageLite11112);
                                                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                                                z7 = true;
                                                                                            }
                                                                                        }
                                                                                        return new tnq(tnxVar, list4, list5, z7);
                                                                                    }
                                                                                });
                                                                                afuuVar.a(listenableFutureN);
                                                                            }
                                                                            JniZero.l(afuuVarC2, th116);
                                                                            wmnVar.b();
                                                                            listE = r11116.e(executor, wlzVarC11111.a, r11116.e.u);
                                                                            if (r10 == 0) {
                                                                                if (listE.isEmpty()) {
                                                                                    r11 = awno.a;
                                                                                } else {
                                                                                    r3 = listE;
                                                                                }
                                                                                list3 = (List) awrmVar3.a;
                                                                                if (list3 == null) {
                                                                                    list3 = awno.a;
                                                                                }
                                                                                afuuVar = afuuVar;
                                                                                listenableFutureN = r11116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                                                    @Override // defpackage.awql
                                                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                                        MessageLite messageLite11112;
                                                                                        tnx tnxVar = (tnx) obj2;
                                                                                        List list4 = (List) obj3;
                                                                                        List list5 = (List) obj4;
                                                                                        tnxVar.getClass();
                                                                                        list4.getClass();
                                                                                        list5.getClass();
                                                                                        boolean z7 = false;
                                                                                        if (tnxVar.h() && (messageLite11112 = (MessageLite) tnxVar.c().a) != null) {
                                                                                            alop alopVar = (alop) r11116.d.a(messageLite11112);
                                                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                                                z7 = true;
                                                                                            }
                                                                                        }
                                                                                        return new tnq(tnxVar, list4, list5, z7);
                                                                                    }
                                                                                });
                                                                                afuuVar.a(listenableFutureN);
                                                                            } else {
                                                                                r10.addAll(listE);
                                                                                r11 = r10;
                                                                            }
                                                                            r3 = r11;
                                                                            list3 = (List) awrmVar3.a;
                                                                            if (list3 == null) {
                                                                                list3 = awno.a;
                                                                            }
                                                                            afuuVar = afuuVar;
                                                                            listenableFutureN = r11116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                                                @Override // defpackage.awql
                                                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                                    MessageLite messageLite11112;
                                                                                    tnx tnxVar = (tnx) obj2;
                                                                                    List list4 = (List) obj3;
                                                                                    List list5 = (List) obj4;
                                                                                    tnxVar.getClass();
                                                                                    list4.getClass();
                                                                                    list5.getClass();
                                                                                    boolean z7 = false;
                                                                                    if (tnxVar.h() && (messageLite11112 = (MessageLite) tnxVar.c().a) != null) {
                                                                                        alop alopVar = (alop) r11116.d.a(messageLite11112);
                                                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                                            z7 = true;
                                                                                        }
                                                                                    }
                                                                                    return new tnq(tnxVar, list4, list5, z7);
                                                                                }
                                                                            });
                                                                            afuuVar.a(listenableFutureN);
                                                                        } catch (aiik e5) {
                                                                            e = e5;
                                                                            afuuVar = afuuVar;
                                                                            twu.c(6, "Failed while attempting to deserialize network response", e);
                                                                            tnx tnxVarD4 = tnx.d(new tnp(e));
                                                                            list2 = (List) awrmVar3.a;
                                                                            if (list2 == null) {
                                                                                list2 = awno.a;
                                                                            }
                                                                            listenableFutureN = ahng.n(new tnq(tnxVarD4, arrayList4, list2, 8));
                                                                            wmnVar.b();
                                                                        }
                                                                        wlz wlzVarC11112 = r11116.c(tnmVar, aigmVar11111, messageLite11111, zzaVar11111, wkwVar);
                                                                    } catch (Throwable th25) {
                                                                        th = th25;
                                                                        th3 = th;
                                                                        try {
                                                                            throw th3;
                                                                        } catch (Throwable th26) {
                                                                            try {
                                                                                JniZero.l(afuuVarC2, th3);
                                                                                throw th26;
                                                                            } catch (aiik e6) {
                                                                                e = e6;
                                                                            }
                                                                        }
                                                                    }
                                                                    aigm aigmVar11112 = aigmVarT;
                                                                    MessageLite messageLite11112 = wmkVar2.f;
                                                                    zza zzaVar11112 = wmkVar2.g;
                                                                    final wmk r11117 = wmkVar2;
                                                                    awrmVar3 = awrmVar2;
                                                                } catch (Throwable th27) {
                                                                    th3 = th27;
                                                                    afuuVar = afuuVar;
                                                                    awrmVar3 = awrmVar2;
                                                                    throw th3;
                                                                }
                                                            } catch (Throwable th28) {
                                                                th = th28;
                                                                awrmVar3 = awrmVar2;
                                                            }
                                                        } catch (aiik e7) {
                                                            e = e7;
                                                            awrmVar2 = awrmVar4;
                                                            wmnVar = wmnVar2;
                                                        }
                                                    } else {
                                                        wmnVar = wmnVar2;
                                                        Throwable th117 = th2;
                                                        afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                        wmoVar = wmkVar2.a;
                                                        if (wmoVar.c()) {
                                                            aigmVarT = wmoVar.a(iterable);
                                                        } else {
                                                            if (iterable == tnmVar.c()) {
                                                                aigmVarT = tnmVar.b();
                                                            } else {
                                                                aigmVarT = aigm.T(iterable);
                                                            }
                                                            aigm aigmVar11113 = aigmVarT;
                                                            MessageLite messageLite11113 = wmkVar2.f;
                                                            zza zzaVar11113 = wmkVar2.g;
                                                            final wmk r11118 = wmkVar2;
                                                            awrmVar3 = awrmVar2;
                                                            wlz wlzVarC11113 = r11118.c(tnmVar, aigmVar11113, messageLite11113, zzaVar11113, wkwVar);
                                                            JniZero.l(afuuVarC2, th117);
                                                            wmnVar.b();
                                                            listE = r11118.e(executor, wlzVarC11113.a, r11118.e.u);
                                                            if (r10 == 0) {
                                                                if (listE.isEmpty()) {
                                                                    r11 = awno.a;
                                                                } else {
                                                                    r3 = listE;
                                                                }
                                                                list3 = (List) awrmVar3.a;
                                                                if (list3 == null) {
                                                                    list3 = awno.a;
                                                                }
                                                                afuuVar = afuuVar;
                                                                listenableFutureN = r11118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                                    @Override // defpackage.awql
                                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                        MessageLite messageLite11114;
                                                                        tnx tnxVar = (tnx) obj2;
                                                                        List list4 = (List) obj3;
                                                                        List list5 = (List) obj4;
                                                                        tnxVar.getClass();
                                                                        list4.getClass();
                                                                        list5.getClass();
                                                                        boolean z7 = false;
                                                                        if (tnxVar.h() && (messageLite11114 = (MessageLite) tnxVar.c().a) != null) {
                                                                            alop alopVar = (alop) r11118.d.a(messageLite11114);
                                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                                z7 = true;
                                                                            }
                                                                        }
                                                                        return new tnq(tnxVar, list4, list5, z7);
                                                                    }
                                                                });
                                                                afuuVar.a(listenableFutureN);
                                                            } else {
                                                                r10.addAll(listE);
                                                                r11 = r10;
                                                            }
                                                            r3 = r11;
                                                            list3 = (List) awrmVar3.a;
                                                            if (list3 == null) {
                                                                list3 = awno.a;
                                                            }
                                                            afuuVar = afuuVar;
                                                            listenableFutureN = r11118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                                @Override // defpackage.awql
                                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                    MessageLite messageLite11114;
                                                                    tnx tnxVar = (tnx) obj2;
                                                                    List list4 = (List) obj3;
                                                                    List list5 = (List) obj4;
                                                                    tnxVar.getClass();
                                                                    list4.getClass();
                                                                    list5.getClass();
                                                                    boolean z7 = false;
                                                                    if (tnxVar.h() && (messageLite11114 = (MessageLite) tnxVar.c().a) != null) {
                                                                        alop alopVar = (alop) r11118.d.a(messageLite11114);
                                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                            z7 = true;
                                                                        }
                                                                    }
                                                                    return new tnq(tnxVar, list4, list5, z7);
                                                                }
                                                            });
                                                            afuuVar.a(listenableFutureN);
                                                        }
                                                        aigm aigmVar11114 = aigmVarT;
                                                        MessageLite messageLite11114 = wmkVar2.f;
                                                        zza zzaVar11114 = wmkVar2.g;
                                                        final wmk r11119 = wmkVar2;
                                                        awrmVar3 = awrmVar2;
                                                        wlz wlzVarC11114 = r11119.c(tnmVar, aigmVar11114, messageLite11114, zzaVar11114, wkwVar);
                                                        JniZero.l(afuuVarC2, th117);
                                                        wmnVar.b();
                                                        listE = r11119.e(executor, wlzVarC11114.a, r11119.e.u);
                                                        if (r10 == 0) {
                                                            if (listE.isEmpty()) {
                                                                r11 = awno.a;
                                                            } else {
                                                                r3 = listE;
                                                            }
                                                            list3 = (List) awrmVar3.a;
                                                            if (list3 == null) {
                                                                list3 = awno.a;
                                                            }
                                                            afuuVar = afuuVar;
                                                            listenableFutureN = r11119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                                @Override // defpackage.awql
                                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                    MessageLite messageLite11115;
                                                                    tnx tnxVar = (tnx) obj2;
                                                                    List list4 = (List) obj3;
                                                                    List list5 = (List) obj4;
                                                                    tnxVar.getClass();
                                                                    list4.getClass();
                                                                    list5.getClass();
                                                                    boolean z7 = false;
                                                                    if (tnxVar.h() && (messageLite11115 = (MessageLite) tnxVar.c().a) != null) {
                                                                        alop alopVar = (alop) r11119.d.a(messageLite11115);
                                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                            z7 = true;
                                                                        }
                                                                    }
                                                                    return new tnq(tnxVar, list4, list5, z7);
                                                                }
                                                            });
                                                            afuuVar.a(listenableFutureN);
                                                        } else {
                                                            r10.addAll(listE);
                                                            r11 = r10;
                                                        }
                                                        r3 = r11;
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r11119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite11115;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite11115 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r11119.d.a(messageLite11115);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    }
                                                    JniZero.l(afuuVar, null);
                                                    return listenableFutureN;
                                                } catch (Throwable th29) {
                                                    th = th29;
                                                    obj = afuuVar;
                                                    th = th;
                                                    r1 = obj;
                                                    throw th;
                                                }
                                            }
                                            r0 = xplVar.b;
                                            iterable = wmnVar2.a;
                                            if (wmnVar2.d == null) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            if (z4) {
                                                xxjVar = new xxj(wmnVar2, null);
                                                afuuVarC3 = afwt.c(78, "processFutAsync");
                                                th2 = null;
                                                wmkVar2 = wmkVar;
                                                dovVar = wmkVar2.k;
                                                zwaVar = wmkVar2.e.u;
                                                if (dovVar.a.isEmpty()) {
                                                    listenableFutureAq = aher.a;
                                                    i2 = 2;
                                                    i3 = 0;
                                                } else {
                                                    i2 = 2;
                                                    i3 = 0;
                                                    listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                                }
                                                listenableFuture = listenableFutureAq;
                                                afuuVarC3.a(listenableFuture);
                                                JniZero.l(afuuVarC3, th2);
                                            } else {
                                                wmkVar2 = wmkVar;
                                                i2 = 2;
                                                th2 = null;
                                                i3 = 0;
                                                albeVarA = wmnVar2.a();
                                                if (albeVarA != null) {
                                                    afuuVarC = afwt.c(79, "processFutAsync");
                                                    ListenableFuture listenableFutureU12 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                                    afuuVarC.a(listenableFutureU12);
                                                    JniZero.l(afuuVarC, null);
                                                    listenableFuture = listenableFutureU12;
                                                } else {
                                                    listenableFuture = null;
                                                }
                                            }
                                            if (listenableFuture != null) {
                                                ArrayList arrayList17 = new ArrayList();
                                                arrayList17.add(listenableFuture);
                                                r10 = arrayList17;
                                            } else {
                                                r10 = th2;
                                            }
                                            apktVar2 = wmnVar2.b;
                                            if (apktVar2 != null) {
                                                uwkVar = new uwk(arrayList4, 16);
                                                awrmVar4 = awrmVar2;
                                                uwkVar2 = new uwk(awrmVar4, 17);
                                                while (r0.hasNext()) {
                                                    th2 = th2;
                                                    i4 = apksVar.b;
                                                    if ((i4 & 1) != 0) {
                                                        i5 = apksVar.c;
                                                        if (i5 != 0) {
                                                            i6 = 4;
                                                        } else if (i5 != i2) {
                                                            i6 = 1;
                                                        } else if (i5 != 4) {
                                                            i6 = 2;
                                                        } else if (i5 != 5) {
                                                            i6 = i3;
                                                        } else {
                                                            i6 = 3;
                                                        }
                                                        if (i6 != 0) {
                                                            throw th2;
                                                        }
                                                        i7 = i6 - 1;
                                                        if (i7 != 0) {
                                                            if (i7 != 1) {
                                                                if (i7 != 2) {
                                                                    if (i5 == 5) {
                                                                        BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                                    } else {
                                                                        BooleanValue = i3;
                                                                    }
                                                                    if (BooleanValue != 0) {
                                                                        String str113 = apksVar.e;
                                                                        str113.getClass();
                                                                        uwkVar2.invoke(str113);
                                                                    }
                                                                } else if (i7 != 3) {
                                                                    throw new awmj();
                                                                }
                                                            }
                                                            th2 = th2;
                                                            i2 = 2;
                                                        } else if ((i4 & 2) != 0) {
                                                            ajnvVar = apksVar.f;
                                                            if (ajnvVar == null) {
                                                                ajnvVar = ajnv.a;
                                                            }
                                                            ajnvVar.getClass();
                                                            map = tnmVar.e;
                                                            uwk uwkVar14 = uwkVar2;
                                                            awrmVar2 = awrmVar4;
                                                            wmnVar = wmnVar2;
                                                            long epochMilli12 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                            tmsVarA = tmt.a();
                                                            tmsVarA.f(epochMilli12);
                                                            tmsVarA.g(epochMilli12);
                                                            tmsVarA.e(j);
                                                            if (map == null) {
                                                                map = agpn.b;
                                                            }
                                                            tmsVarA.d(map);
                                                            if (true != ajnvVar.e) {
                                                                i8 = 1;
                                                            } else {
                                                                i8 = 2;
                                                            }
                                                            tmsVarA.d = i8;
                                                            if ((ajnvVar.b & 4) != 0) {
                                                                tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                            }
                                                            tmt tmtVarA12 = tmsVarA.a();
                                                            i2 = 2;
                                                            if (apksVar.c == 2) {
                                                                ajegVar = (ajeg) apksVar.d;
                                                            } else {
                                                                ajegVar = ajeg.a;
                                                            }
                                                            aifvVar = ajegVar.b;
                                                            if (aifvVar == null) {
                                                                aifvVar = aifv.a;
                                                            }
                                                            byte[] bArrG12 = aifvVar.c.G();
                                                            String str114 = apksVar.e;
                                                            str114.getClass();
                                                            uwkVar.invoke(new tne(bArrG12, tmtVarA12, str114));
                                                            uwkVar2 = uwkVar14;
                                                            wmnVar2 = wmnVar;
                                                            awrmVar4 = awrmVar2;
                                                        } else {
                                                            i2 = 2;
                                                        }
                                                    }
                                                    j = 0;
                                                }
                                                awrmVar2 = awrmVar4;
                                                wmnVar = wmnVar2;
                                                Throwable th118 = th2;
                                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                wmoVar = wmkVar2.a;
                                                if (wmoVar.c()) {
                                                    aigmVarT = wmoVar.a(iterable);
                                                } else {
                                                    if (iterable == tnmVar.c()) {
                                                        aigmVarT = tnmVar.b();
                                                    } else {
                                                        aigmVarT = aigm.T(iterable);
                                                    }
                                                    aigm aigmVar11115 = aigmVarT;
                                                    MessageLite messageLite11115 = wmkVar2.f;
                                                    zza zzaVar11115 = wmkVar2.g;
                                                    final wmk r111110 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC11115 = r111110.c(tnmVar, aigmVar11115, messageLite11115, zzaVar11115, wkwVar);
                                                    JniZero.l(afuuVarC2, th118);
                                                    wmnVar.b();
                                                    listE = r111110.e(executor, wlzVarC11115.a, r111110.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r111110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite11116;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite11116 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r111110.d.a(messageLite11116);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r111110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite11116;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite11116 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r111110.d.a(messageLite11116);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                }
                                                aigm aigmVar11116 = aigmVarT;
                                                MessageLite messageLite11116 = wmkVar2.f;
                                                zza zzaVar11116 = wmkVar2.g;
                                                final wmk r111111 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC11116 = r111111.c(tnmVar, aigmVar11116, messageLite11116, zzaVar11116, wkwVar);
                                                JniZero.l(afuuVarC2, th118);
                                                wmnVar.b();
                                                listE = r111111.e(executor, wlzVarC11116.a, r111111.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r111111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite11117;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite11117 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r111111.d.a(messageLite11117);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r111111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite11117;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite11117 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r111111.d.a(messageLite11117);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            } else {
                                                wmnVar = wmnVar2;
                                                Throwable th119 = th2;
                                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                                wmoVar = wmkVar2.a;
                                                if (wmoVar.c()) {
                                                    aigmVarT = wmoVar.a(iterable);
                                                } else {
                                                    if (iterable == tnmVar.c()) {
                                                        aigmVarT = tnmVar.b();
                                                    } else {
                                                        aigmVarT = aigm.T(iterable);
                                                    }
                                                    aigm aigmVar11117 = aigmVarT;
                                                    MessageLite messageLite11117 = wmkVar2.f;
                                                    zza zzaVar11117 = wmkVar2.g;
                                                    final wmk r111112 = wmkVar2;
                                                    awrmVar3 = awrmVar2;
                                                    wlz wlzVarC11117 = r111112.c(tnmVar, aigmVar11117, messageLite11117, zzaVar11117, wkwVar);
                                                    JniZero.l(afuuVarC2, th119);
                                                    wmnVar.b();
                                                    listE = r111112.e(executor, wlzVarC11117.a, r111112.e.u);
                                                    if (r10 == 0) {
                                                        if (listE.isEmpty()) {
                                                            r11 = awno.a;
                                                        } else {
                                                            r3 = listE;
                                                        }
                                                        list3 = (List) awrmVar3.a;
                                                        if (list3 == null) {
                                                            list3 = awno.a;
                                                        }
                                                        afuuVar = afuuVar;
                                                        listenableFutureN = r111112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                            @Override // defpackage.awql
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                MessageLite messageLite11118;
                                                                tnx tnxVar = (tnx) obj2;
                                                                List list4 = (List) obj3;
                                                                List list5 = (List) obj4;
                                                                tnxVar.getClass();
                                                                list4.getClass();
                                                                list5.getClass();
                                                                boolean z7 = false;
                                                                if (tnxVar.h() && (messageLite11118 = (MessageLite) tnxVar.c().a) != null) {
                                                                    alop alopVar = (alop) r111112.d.a(messageLite11118);
                                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                return new tnq(tnxVar, list4, list5, z7);
                                                            }
                                                        });
                                                        afuuVar.a(listenableFutureN);
                                                    } else {
                                                        r10.addAll(listE);
                                                        r11 = r10;
                                                    }
                                                    r3 = r11;
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r111112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite11118;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite11118 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r111112.d.a(messageLite11118);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                }
                                                aigm aigmVar11118 = aigmVarT;
                                                MessageLite messageLite11118 = wmkVar2.f;
                                                zza zzaVar11118 = wmkVar2.g;
                                                final wmk r111113 = wmkVar2;
                                                awrmVar3 = awrmVar2;
                                                wlz wlzVarC11118 = r111113.c(tnmVar, aigmVar11118, messageLite11118, zzaVar11118, wkwVar);
                                                JniZero.l(afuuVarC2, th119);
                                                wmnVar.b();
                                                listE = r111113.e(executor, wlzVarC11118.a, r111113.e.u);
                                                if (r10 == 0) {
                                                    if (listE.isEmpty()) {
                                                        r11 = awno.a;
                                                    } else {
                                                        r3 = listE;
                                                    }
                                                    list3 = (List) awrmVar3.a;
                                                    if (list3 == null) {
                                                        list3 = awno.a;
                                                    }
                                                    afuuVar = afuuVar;
                                                    listenableFutureN = r111113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                        @Override // defpackage.awql
                                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            MessageLite messageLite11119;
                                                            tnx tnxVar = (tnx) obj2;
                                                            List list4 = (List) obj3;
                                                            List list5 = (List) obj4;
                                                            tnxVar.getClass();
                                                            list4.getClass();
                                                            list5.getClass();
                                                            boolean z7 = false;
                                                            if (tnxVar.h() && (messageLite11119 = (MessageLite) tnxVar.c().a) != null) {
                                                                alop alopVar = (alop) r111113.d.a(messageLite11119);
                                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                    z7 = true;
                                                                }
                                                            }
                                                            return new tnq(tnxVar, list4, list5, z7);
                                                        }
                                                    });
                                                    afuuVar.a(listenableFutureN);
                                                } else {
                                                    r10.addAll(listE);
                                                    r11 = r10;
                                                }
                                                r3 = r11;
                                                list3 = (List) awrmVar3.a;
                                                if (list3 == null) {
                                                    list3 = awno.a;
                                                }
                                                afuuVar = afuuVar;
                                                listenableFutureN = r111113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                    @Override // defpackage.awql
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        MessageLite messageLite11119;
                                                        tnx tnxVar = (tnx) obj2;
                                                        List list4 = (List) obj3;
                                                        List list5 = (List) obj4;
                                                        tnxVar.getClass();
                                                        list4.getClass();
                                                        list5.getClass();
                                                        boolean z7 = false;
                                                        if (tnxVar.h() && (messageLite11119 = (MessageLite) tnxVar.c().a) != null) {
                                                            alop alopVar = (alop) r111113.d.a(messageLite11119);
                                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        return new tnq(tnxVar, list4, list5, z7);
                                                    }
                                                });
                                                afuuVar.a(listenableFutureN);
                                            }
                                        } catch (aiik e8) {
                                            e = e8;
                                        }
                                        JniZero.l(afuuVar, null);
                                        return listenableFutureN;
                                    } catch (Throwable th30) {
                                        th = th30;
                                        wmnVar = wmnVar2;
                                    }
                                } catch (Throwable th31) {
                                    th = th31;
                                }
                                r25 = r0;
                                if (iterableJ != null) {
                                    hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                } else {
                                    hhoVar = null;
                                }
                                if (xplVar != null) {
                                    r30 = xplVar.a;
                                } else {
                                    r30 = 0;
                                }
                                wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                wmnVar2 = wmnVar;
                            } catch (IOException e9) {
                                e = e9;
                                awrmVar2 = awrmVar5;
                                afuuVar = afuuVarC4;
                            } catch (Throwable th32) {
                                th = th32;
                                afuuVar = afuuVarC4;
                                th = th;
                                r1 = afuuVar;
                                throw th;
                            }
                            throw th;
                        }
                        c2 = 1;
                        arrayList = new ArrayList();
                        apktVar = null;
                        albeVar = null;
                        iterableJ = null;
                        while (!aigmVarA.D()) {
                            iE = aigmVarA.e();
                            iN = aigmVarA.n();
                            if (iN != 0) {
                                break;
                                break;
                            }
                            c = c;
                            if (iN != 10) {
                                long j12 = iE;
                                iK2 = aigmVarA.k();
                                jE = aigmVarA.e();
                                int iF4 = aigmVarA.f(iK2);
                                j3 = -1;
                                jE2 = -1;
                                apktVar = null;
                                while (true) {
                                    if (!aigmVarA.D()) {
                                        jE = jE;
                                        break;
                                    }
                                    jE = jE;
                                    jE3 = aigmVarA.e();
                                    iN2 = aigmVarA.n();
                                    if (iN2 != 0) {
                                        break;
                                        break;
                                    }
                                    if (iN2 == 258) {
                                        int iF5 = aigmVarA.f(aigmVarA.k());
                                        apkt apktVar4 = apkt.a;
                                        apktVar = (apkt) aihn.getParserForClass(apkt.class).f(aigmVarA, wmo.a);
                                        aigmVarA.A(iF5);
                                        jE2 = aigmVarA.e();
                                        iK2 = iK2;
                                        j3 = jE3;
                                    } else {
                                        aigmVarA.F(iN2);
                                        iK2 = iK2;
                                    }
                                }
                                int i19 = iK2;
                                aigmVarA.A(iF4);
                                if (apktVar != null) {
                                    aigmVarA = aigmVarA;
                                    wkwVar2 = wkwVar2;
                                    iB = iB;
                                } else {
                                    aigmVarA = aigmVarA;
                                    wkwVar2 = wkwVar2;
                                    iB = iB;
                                }
                                aigmVarA = aigmVarA;
                                wkwVar2 = wkwVar2;
                                iB = iB;
                                c2 = 1;
                            } else if (iN != 6218) {
                                aigmVarA.F(iN);
                            } else {
                                iK = aigmVarA.k();
                                if (c != 0) {
                                    int iE3 = aigmVarA.e();
                                    aigmVarA.C(iK);
                                    iterableJ = nsi.j(C, iE3, iK);
                                } else {
                                    int iF6 = aigmVarA.f(iK);
                                    albe albeVar4 = albe.a;
                                    albe albeVar5 = (albe) aihn.getParserForClass(albe.class).f(aigmVarA, wmo.a);
                                    aigmVarA.A(iF6);
                                    albeVar = albeVar5;
                                }
                                if (!z6) {
                                    arrayList.add(new wmm(iE, aigmVarA.e(), null));
                                }
                            }
                        }
                        wkwVar = wkwVar2;
                        i = iB;
                        if (z2) {
                            wmkVar = wmkVar3;
                            z3 = z5;
                            awrmVar2 = awrmVar5;
                            afuuVar = afuuVarC4;
                            arrayList2 = arrayList5;
                            j = 0;
                            xplVar = null;
                            if (xplVar == null) {
                                r0 = C;
                                if (!arrayList.isEmpty()) {
                                    arrayList3 = new ArrayList(C.size() + arrayList.size());
                                    it = arrayList.iterator();
                                    if (it.hasNext()) {
                                        wmmVar = (wmm) it.next();
                                    } else {
                                        wmmVar = null;
                                    }
                                    j2 = j;
                                    while (r0.hasNext()) {
                                        long jRemaining7 = ((long) byteBuffer2.remaining()) + j2;
                                        if (wmmVar != null) {
                                            it2 = it;
                                            arrayList3.add(byteBuffer2.duplicate());
                                        } else {
                                            it2 = it;
                                            arrayList3.add(byteBuffer2.duplicate());
                                        }
                                        j2 = jRemaining7;
                                        it = it2;
                                    }
                                    r25 = arrayList3;
                                }
                                if (iterableJ != null) {
                                    hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                } else {
                                    hhoVar = null;
                                }
                                if (xplVar != null) {
                                    r30 = xplVar.a;
                                } else {
                                    r30 = 0;
                                }
                                wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                wmnVar2 = wmnVar;
                                iterable = wmnVar2.a;
                                if (wmnVar2.d == null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    xxjVar = new xxj(wmnVar2, null);
                                    afuuVarC3 = afwt.c(78, "processFutAsync");
                                    th2 = null;
                                    wmkVar2 = wmkVar;
                                    dovVar = wmkVar2.k;
                                    zwaVar = wmkVar2.e.u;
                                    if (dovVar.a.isEmpty()) {
                                        listenableFutureAq = aher.a;
                                        i2 = 2;
                                        i3 = 0;
                                    } else {
                                        i2 = 2;
                                        i3 = 0;
                                        listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                    }
                                    listenableFuture = listenableFutureAq;
                                    afuuVarC3.a(listenableFuture);
                                    JniZero.l(afuuVarC3, th2);
                                } else {
                                    wmkVar2 = wmkVar;
                                    i2 = 2;
                                    th2 = null;
                                    i3 = 0;
                                    albeVarA = wmnVar2.a();
                                    if (albeVarA != null) {
                                        afuuVarC = afwt.c(79, "processFutAsync");
                                        ListenableFuture listenableFutureU13 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                        afuuVarC.a(listenableFutureU13);
                                        JniZero.l(afuuVarC, null);
                                        listenableFuture = listenableFutureU13;
                                    } else {
                                        listenableFuture = null;
                                    }
                                }
                                if (listenableFuture != null) {
                                    ArrayList arrayList18 = new ArrayList();
                                    arrayList18.add(listenableFuture);
                                    r10 = arrayList18;
                                } else {
                                    r10 = th2;
                                }
                                apktVar2 = wmnVar2.b;
                                if (apktVar2 != null) {
                                    uwkVar = new uwk(arrayList4, 16);
                                    awrmVar4 = awrmVar2;
                                    uwkVar2 = new uwk(awrmVar4, 17);
                                    while (r0.hasNext()) {
                                        th2 = th2;
                                        i4 = apksVar.b;
                                        if ((i4 & 1) != 0) {
                                            i5 = apksVar.c;
                                            if (i5 != 0) {
                                                i6 = 4;
                                            } else if (i5 != i2) {
                                                i6 = 1;
                                            } else if (i5 != 4) {
                                                i6 = 2;
                                            } else if (i5 != 5) {
                                                i6 = i3;
                                            } else {
                                                i6 = 3;
                                            }
                                            if (i6 != 0) {
                                                throw th2;
                                            }
                                            i7 = i6 - 1;
                                            if (i7 != 0) {
                                                if (i7 != 1) {
                                                    if (i7 != 2) {
                                                        if (i5 == 5) {
                                                            BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                        } else {
                                                            BooleanValue = i3;
                                                        }
                                                        if (BooleanValue != 0) {
                                                            String str115 = apksVar.e;
                                                            str115.getClass();
                                                            uwkVar2.invoke(str115);
                                                        }
                                                    } else if (i7 != 3) {
                                                        throw new awmj();
                                                    }
                                                }
                                                th2 = th2;
                                                i2 = 2;
                                            } else if ((i4 & 2) != 0) {
                                                ajnvVar = apksVar.f;
                                                if (ajnvVar == null) {
                                                    ajnvVar = ajnv.a;
                                                }
                                                ajnvVar.getClass();
                                                map = tnmVar.e;
                                                uwk uwkVar15 = uwkVar2;
                                                awrmVar2 = awrmVar4;
                                                wmnVar = wmnVar2;
                                                long epochMilli13 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                tmsVarA = tmt.a();
                                                tmsVarA.f(epochMilli13);
                                                tmsVarA.g(epochMilli13);
                                                tmsVarA.e(j);
                                                if (map == null) {
                                                    map = agpn.b;
                                                }
                                                tmsVarA.d(map);
                                                if (true != ajnvVar.e) {
                                                    i8 = 1;
                                                } else {
                                                    i8 = 2;
                                                }
                                                tmsVarA.d = i8;
                                                if ((ajnvVar.b & 4) != 0) {
                                                    tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                }
                                                tmt tmtVarA13 = tmsVarA.a();
                                                i2 = 2;
                                                if (apksVar.c == 2) {
                                                    ajegVar = (ajeg) apksVar.d;
                                                } else {
                                                    ajegVar = ajeg.a;
                                                }
                                                aifvVar = ajegVar.b;
                                                if (aifvVar == null) {
                                                    aifvVar = aifv.a;
                                                }
                                                byte[] bArrG13 = aifvVar.c.G();
                                                String str116 = apksVar.e;
                                                str116.getClass();
                                                uwkVar.invoke(new tne(bArrG13, tmtVarA13, str116));
                                                uwkVar2 = uwkVar15;
                                                wmnVar2 = wmnVar;
                                                awrmVar4 = awrmVar2;
                                            } else {
                                                i2 = 2;
                                            }
                                        }
                                        j = 0;
                                    }
                                    awrmVar2 = awrmVar4;
                                    wmnVar = wmnVar2;
                                    Throwable th1110 = th2;
                                    afuuVarC2 = afwt.c(84, "parseResponseProto");
                                    wmoVar = wmkVar2.a;
                                    if (wmoVar.c()) {
                                        aigmVarT = wmoVar.a(iterable);
                                    } else {
                                        if (iterable == tnmVar.c()) {
                                            aigmVarT = tnmVar.b();
                                        } else {
                                            aigmVarT = aigm.T(iterable);
                                        }
                                        aigm aigmVar11119 = aigmVarT;
                                        MessageLite messageLite11119 = wmkVar2.f;
                                        zza zzaVar11119 = wmkVar2.g;
                                        final wmk r111114 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC11119 = r111114.c(tnmVar, aigmVar11119, messageLite11119, zzaVar11119, wkwVar);
                                        JniZero.l(afuuVarC2, th1110);
                                        wmnVar.b();
                                        listE = r111114.e(executor, wlzVarC11119.a, r111114.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r111114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite111110;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite111110 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r111114.d.a(messageLite111110);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r111114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite111110;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite111110 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r111114.d.a(messageLite111110);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    }
                                    aigm aigmVar111110 = aigmVarT;
                                    MessageLite messageLite111110 = wmkVar2.f;
                                    zza zzaVar111110 = wmkVar2.g;
                                    final wmk r111115 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC111110 = r111115.c(tnmVar, aigmVar111110, messageLite111110, zzaVar111110, wkwVar);
                                    JniZero.l(afuuVarC2, th1110);
                                    wmnVar.b();
                                    listE = r111115.e(executor, wlzVarC111110.a, r111115.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r111115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite111111;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite111111 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r111115.d.a(messageLite111111);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r111115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite111111;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite111111 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r111115.d.a(messageLite111111);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    wmnVar = wmnVar2;
                                    Throwable th1111 = th2;
                                    afuuVarC2 = afwt.c(84, "parseResponseProto");
                                    wmoVar = wmkVar2.a;
                                    if (wmoVar.c()) {
                                        aigmVarT = wmoVar.a(iterable);
                                    } else {
                                        if (iterable == tnmVar.c()) {
                                            aigmVarT = tnmVar.b();
                                        } else {
                                            aigmVarT = aigm.T(iterable);
                                        }
                                        aigm aigmVar111111 = aigmVarT;
                                        MessageLite messageLite111111 = wmkVar2.f;
                                        zza zzaVar111111 = wmkVar2.g;
                                        final wmk r111116 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC111111 = r111116.c(tnmVar, aigmVar111111, messageLite111111, zzaVar111111, wkwVar);
                                        JniZero.l(afuuVarC2, th1111);
                                        wmnVar.b();
                                        listE = r111116.e(executor, wlzVarC111111.a, r111116.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r111116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite111112;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite111112 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r111116.d.a(messageLite111112);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r111116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite111112;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite111112 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r111116.d.a(messageLite111112);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    }
                                    aigm aigmVar111112 = aigmVarT;
                                    MessageLite messageLite111112 = wmkVar2.f;
                                    zza zzaVar111112 = wmkVar2.g;
                                    final wmk r111117 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC111112 = r111117.c(tnmVar, aigmVar111112, messageLite111112, zzaVar111112, wkwVar);
                                    JniZero.l(afuuVarC2, th1111);
                                    wmnVar.b();
                                    listE = r111117.e(executor, wlzVarC111112.a, r111117.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r111117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite111113;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite111113 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r111117.d.a(messageLite111113);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r111117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite111113;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite111113 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r111117.d.a(messageLite111113);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                }
                                JniZero.l(afuuVar, null);
                                return listenableFutureN;
                            }
                            r0 = xplVar.b;
                            r25 = r0;
                            if (iterableJ != null) {
                                hhoVar = new hho((Object) r4, 10, (int[][]) null);
                            } else {
                                hhoVar = null;
                            }
                            if (xplVar != null) {
                                r30 = xplVar.a;
                            } else {
                                r30 = 0;
                            }
                            wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                            wmnVar2 = wmnVar;
                            iterable = wmnVar2.a;
                            if (wmnVar2.d == null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                xxjVar = new xxj(wmnVar2, null);
                                afuuVarC3 = afwt.c(78, "processFutAsync");
                                th2 = null;
                                wmkVar2 = wmkVar;
                                dovVar = wmkVar2.k;
                                zwaVar = wmkVar2.e.u;
                                if (dovVar.a.isEmpty()) {
                                    listenableFutureAq = aher.a;
                                    i2 = 2;
                                    i3 = 0;
                                } else {
                                    i2 = 2;
                                    i3 = 0;
                                    listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                }
                                listenableFuture = listenableFutureAq;
                                afuuVarC3.a(listenableFuture);
                                JniZero.l(afuuVarC3, th2);
                            } else {
                                wmkVar2 = wmkVar;
                                i2 = 2;
                                th2 = null;
                                i3 = 0;
                                albeVarA = wmnVar2.a();
                                if (albeVarA != null) {
                                    afuuVarC = afwt.c(79, "processFutAsync");
                                    ListenableFuture listenableFutureU14 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                    afuuVarC.a(listenableFutureU14);
                                    JniZero.l(afuuVarC, null);
                                    listenableFuture = listenableFutureU14;
                                } else {
                                    listenableFuture = null;
                                }
                            }
                            if (listenableFuture != null) {
                                ArrayList arrayList19 = new ArrayList();
                                arrayList19.add(listenableFuture);
                                r10 = arrayList19;
                            } else {
                                r10 = th2;
                            }
                            apktVar2 = wmnVar2.b;
                            if (apktVar2 != null) {
                                uwkVar = new uwk(arrayList4, 16);
                                awrmVar4 = awrmVar2;
                                uwkVar2 = new uwk(awrmVar4, 17);
                                while (r0.hasNext()) {
                                    th2 = th2;
                                    i4 = apksVar.b;
                                    if ((i4 & 1) != 0) {
                                        i5 = apksVar.c;
                                        if (i5 != 0) {
                                            i6 = 4;
                                        } else if (i5 != i2) {
                                            i6 = 1;
                                        } else if (i5 != 4) {
                                            i6 = 2;
                                        } else if (i5 != 5) {
                                            i6 = i3;
                                        } else {
                                            i6 = 3;
                                        }
                                        if (i6 != 0) {
                                            throw th2;
                                        }
                                        i7 = i6 - 1;
                                        if (i7 != 0) {
                                            if (i7 != 1) {
                                                if (i7 != 2) {
                                                    if (i5 == 5) {
                                                        BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                    } else {
                                                        BooleanValue = i3;
                                                    }
                                                    if (BooleanValue != 0) {
                                                        String str117 = apksVar.e;
                                                        str117.getClass();
                                                        uwkVar2.invoke(str117);
                                                    }
                                                } else if (i7 != 3) {
                                                    throw new awmj();
                                                }
                                            }
                                            th2 = th2;
                                            i2 = 2;
                                        } else if ((i4 & 2) != 0) {
                                            ajnvVar = apksVar.f;
                                            if (ajnvVar == null) {
                                                ajnvVar = ajnv.a;
                                            }
                                            ajnvVar.getClass();
                                            map = tnmVar.e;
                                            uwk uwkVar16 = uwkVar2;
                                            awrmVar2 = awrmVar4;
                                            wmnVar = wmnVar2;
                                            long epochMilli14 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                            tmsVarA = tmt.a();
                                            tmsVarA.f(epochMilli14);
                                            tmsVarA.g(epochMilli14);
                                            tmsVarA.e(j);
                                            if (map == null) {
                                                map = agpn.b;
                                            }
                                            tmsVarA.d(map);
                                            if (true != ajnvVar.e) {
                                                i8 = 1;
                                            } else {
                                                i8 = 2;
                                            }
                                            tmsVarA.d = i8;
                                            if ((ajnvVar.b & 4) != 0) {
                                                tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                            }
                                            tmt tmtVarA14 = tmsVarA.a();
                                            i2 = 2;
                                            if (apksVar.c == 2) {
                                                ajegVar = (ajeg) apksVar.d;
                                            } else {
                                                ajegVar = ajeg.a;
                                            }
                                            aifvVar = ajegVar.b;
                                            if (aifvVar == null) {
                                                aifvVar = aifv.a;
                                            }
                                            byte[] bArrG14 = aifvVar.c.G();
                                            String str118 = apksVar.e;
                                            str118.getClass();
                                            uwkVar.invoke(new tne(bArrG14, tmtVarA14, str118));
                                            uwkVar2 = uwkVar16;
                                            wmnVar2 = wmnVar;
                                            awrmVar4 = awrmVar2;
                                        } else {
                                            i2 = 2;
                                        }
                                        afuuVar = afuuVar;
                                        awrmVar3 = awrmVar2;
                                        twu.c(6, "Failed while attempting to deserialize network response", e);
                                        tnx tnxVarD5 = tnx.d(new tnp(e));
                                        list2 = (List) awrmVar3.a;
                                        if (list2 == null) {
                                            list2 = awno.a;
                                        }
                                        listenableFutureN = ahng.n(new tnq(tnxVarD5, arrayList4, list2, 8));
                                        wmnVar.b();
                                    }
                                    j = 0;
                                }
                                awrmVar2 = awrmVar4;
                                wmnVar = wmnVar2;
                                Throwable th1112 = th2;
                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                wmoVar = wmkVar2.a;
                                if (wmoVar.c()) {
                                    aigmVarT = wmoVar.a(iterable);
                                } else {
                                    if (iterable == tnmVar.c()) {
                                        aigmVarT = tnmVar.b();
                                    } else {
                                        aigmVarT = aigm.T(iterable);
                                    }
                                    aigm aigmVar111113 = aigmVarT;
                                    MessageLite messageLite111113 = wmkVar2.f;
                                    zza zzaVar111113 = wmkVar2.g;
                                    final wmk r111118 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC111113 = r111118.c(tnmVar, aigmVar111113, messageLite111113, zzaVar111113, wkwVar);
                                    JniZero.l(afuuVarC2, th1112);
                                    wmnVar.b();
                                    listE = r111118.e(executor, wlzVarC111113.a, r111118.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r111118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite111114;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite111114 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r111118.d.a(messageLite111114);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r111118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite111114;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite111114 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r111118.d.a(messageLite111114);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                }
                                aigm aigmVar111114 = aigmVarT;
                                MessageLite messageLite111114 = wmkVar2.f;
                                zza zzaVar111114 = wmkVar2.g;
                                final wmk r111119 = wmkVar2;
                                awrmVar3 = awrmVar2;
                                wlz wlzVarC111114 = r111119.c(tnmVar, aigmVar111114, messageLite111114, zzaVar111114, wkwVar);
                                JniZero.l(afuuVarC2, th1112);
                                wmnVar.b();
                                listE = r111119.e(executor, wlzVarC111114.a, r111119.e.u);
                                if (r10 == 0) {
                                    if (listE.isEmpty()) {
                                        r11 = awno.a;
                                    } else {
                                        r3 = listE;
                                    }
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r111119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite111115;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite111115 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r111119.d.a(messageLite111115);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    r10.addAll(listE);
                                    r11 = r10;
                                }
                                r3 = r11;
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r111119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite111115;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite111115 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r111119.d.a(messageLite111115);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            } else {
                                wmnVar = wmnVar2;
                                Throwable th1113 = th2;
                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                wmoVar = wmkVar2.a;
                                if (wmoVar.c()) {
                                    aigmVarT = wmoVar.a(iterable);
                                } else {
                                    if (iterable == tnmVar.c()) {
                                        aigmVarT = tnmVar.b();
                                    } else {
                                        aigmVarT = aigm.T(iterable);
                                    }
                                    aigm aigmVar111115 = aigmVarT;
                                    MessageLite messageLite111115 = wmkVar2.f;
                                    zza zzaVar111115 = wmkVar2.g;
                                    final wmk r1111110 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC111115 = r1111110.c(tnmVar, aigmVar111115, messageLite111115, zzaVar111115, wkwVar);
                                    JniZero.l(afuuVarC2, th1113);
                                    wmnVar.b();
                                    listE = r1111110.e(executor, wlzVarC111115.a, r1111110.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r1111110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite111116;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite111116 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r1111110.d.a(messageLite111116);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r1111110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite111116;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite111116 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r1111110.d.a(messageLite111116);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                }
                                aigm aigmVar111116 = aigmVarT;
                                MessageLite messageLite111116 = wmkVar2.f;
                                zza zzaVar111116 = wmkVar2.g;
                                final wmk r1111111 = wmkVar2;
                                awrmVar3 = awrmVar2;
                                wlz wlzVarC111116 = r1111111.c(tnmVar, aigmVar111116, messageLite111116, zzaVar111116, wkwVar);
                                JniZero.l(afuuVarC2, th1113);
                                wmnVar.b();
                                listE = r1111111.e(executor, wlzVarC111116.a, r1111111.e.u);
                                if (r10 == 0) {
                                    if (listE.isEmpty()) {
                                        r11 = awno.a;
                                    } else {
                                        r3 = listE;
                                    }
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r1111111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite111117;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite111117 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r1111111.d.a(messageLite111117);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    r10.addAll(listE);
                                    r11 = r10;
                                }
                                r3 = r11;
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r1111111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite111117;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite111117 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r1111111.d.a(messageLite111117);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            }
                            JniZero.l(afuuVar, null);
                            return listenableFutureN;
                        }
                        if (arrayList.isEmpty()) {
                            wmkVar = wmkVar3;
                            z3 = z5;
                            awrmVar2 = awrmVar5;
                            afuuVar = afuuVarC4;
                            arrayList2 = arrayList5;
                            j = 0;
                            xplVar = null;
                            if (xplVar == null) {
                                r0 = C;
                                if (!arrayList.isEmpty()) {
                                    arrayList3 = new ArrayList(C.size() + arrayList.size());
                                    it = arrayList.iterator();
                                    if (it.hasNext()) {
                                        wmmVar = (wmm) it.next();
                                    } else {
                                        wmmVar = null;
                                    }
                                    j2 = j;
                                    while (r0.hasNext()) {
                                        long jRemaining8 = ((long) byteBuffer2.remaining()) + j2;
                                        if (wmmVar != null) {
                                            it2 = it;
                                            arrayList3.add(byteBuffer2.duplicate());
                                        } else {
                                            it2 = it;
                                            arrayList3.add(byteBuffer2.duplicate());
                                        }
                                        j2 = jRemaining8;
                                        it = it2;
                                    }
                                    r25 = arrayList3;
                                }
                                if (iterableJ != null) {
                                    hhoVar = new hho((Object) r4, 10, (int[][]) null);
                                } else {
                                    hhoVar = null;
                                }
                                if (xplVar != null) {
                                    r30 = xplVar.a;
                                } else {
                                    r30 = 0;
                                }
                                wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                                wmnVar2 = wmnVar;
                                iterable = wmnVar2.a;
                                if (wmnVar2.d == null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    xxjVar = new xxj(wmnVar2, null);
                                    afuuVarC3 = afwt.c(78, "processFutAsync");
                                    th2 = null;
                                    wmkVar2 = wmkVar;
                                    dovVar = wmkVar2.k;
                                    zwaVar = wmkVar2.e.u;
                                    if (dovVar.a.isEmpty()) {
                                        listenableFutureAq = aher.a;
                                        i2 = 2;
                                        i3 = 0;
                                    } else {
                                        i2 = 2;
                                        i3 = 0;
                                        listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                    }
                                    listenableFuture = listenableFutureAq;
                                    afuuVarC3.a(listenableFuture);
                                    JniZero.l(afuuVarC3, th2);
                                } else {
                                    wmkVar2 = wmkVar;
                                    i2 = 2;
                                    th2 = null;
                                    i3 = 0;
                                    albeVarA = wmnVar2.a();
                                    if (albeVarA != null) {
                                        afuuVarC = afwt.c(79, "processFutAsync");
                                        ListenableFuture listenableFutureU15 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                        afuuVarC.a(listenableFutureU15);
                                        JniZero.l(afuuVarC, null);
                                        listenableFuture = listenableFutureU15;
                                    } else {
                                        listenableFuture = null;
                                    }
                                }
                                if (listenableFuture != null) {
                                    ArrayList arrayList110 = new ArrayList();
                                    arrayList110.add(listenableFuture);
                                    r10 = arrayList110;
                                } else {
                                    r10 = th2;
                                }
                                apktVar2 = wmnVar2.b;
                                if (apktVar2 != null) {
                                    uwkVar = new uwk(arrayList4, 16);
                                    awrmVar4 = awrmVar2;
                                    uwkVar2 = new uwk(awrmVar4, 17);
                                    while (r0.hasNext()) {
                                        th2 = th2;
                                        i4 = apksVar.b;
                                        if ((i4 & 1) != 0) {
                                            i5 = apksVar.c;
                                            if (i5 != 0) {
                                                i6 = 4;
                                            } else if (i5 != i2) {
                                                i6 = 1;
                                            } else if (i5 != 4) {
                                                i6 = 2;
                                            } else if (i5 != 5) {
                                                i6 = i3;
                                            } else {
                                                i6 = 3;
                                            }
                                            if (i6 != 0) {
                                                throw th2;
                                            }
                                            i7 = i6 - 1;
                                            if (i7 != 0) {
                                                if (i7 != 1) {
                                                    if (i7 != 2) {
                                                        if (i5 == 5) {
                                                            BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                        } else {
                                                            BooleanValue = i3;
                                                        }
                                                        if (BooleanValue != 0) {
                                                            String str119 = apksVar.e;
                                                            str119.getClass();
                                                            uwkVar2.invoke(str119);
                                                        }
                                                    } else if (i7 != 3) {
                                                        throw new awmj();
                                                    }
                                                }
                                                th2 = th2;
                                                i2 = 2;
                                            } else if ((i4 & 2) != 0) {
                                                ajnvVar = apksVar.f;
                                                if (ajnvVar == null) {
                                                    ajnvVar = ajnv.a;
                                                }
                                                ajnvVar.getClass();
                                                map = tnmVar.e;
                                                uwk uwkVar17 = uwkVar2;
                                                awrmVar2 = awrmVar4;
                                                wmnVar = wmnVar2;
                                                long epochMilli15 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                                tmsVarA = tmt.a();
                                                tmsVarA.f(epochMilli15);
                                                tmsVarA.g(epochMilli15);
                                                tmsVarA.e(j);
                                                if (map == null) {
                                                    map = agpn.b;
                                                }
                                                tmsVarA.d(map);
                                                if (true != ajnvVar.e) {
                                                    i8 = 1;
                                                } else {
                                                    i8 = 2;
                                                }
                                                tmsVarA.d = i8;
                                                if ((ajnvVar.b & 4) != 0) {
                                                    tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                                }
                                                tmt tmtVarA15 = tmsVarA.a();
                                                i2 = 2;
                                                if (apksVar.c == 2) {
                                                    ajegVar = (ajeg) apksVar.d;
                                                } else {
                                                    ajegVar = ajeg.a;
                                                }
                                                aifvVar = ajegVar.b;
                                                if (aifvVar == null) {
                                                    aifvVar = aifv.a;
                                                }
                                                byte[] bArrG15 = aifvVar.c.G();
                                                String str1110 = apksVar.e;
                                                str1110.getClass();
                                                uwkVar.invoke(new tne(bArrG15, tmtVarA15, str1110));
                                                uwkVar2 = uwkVar17;
                                                wmnVar2 = wmnVar;
                                                awrmVar4 = awrmVar2;
                                            } else {
                                                i2 = 2;
                                            }
                                        }
                                        j = 0;
                                    }
                                    awrmVar2 = awrmVar4;
                                    wmnVar = wmnVar2;
                                    Throwable th1114 = th2;
                                    afuuVarC2 = afwt.c(84, "parseResponseProto");
                                    wmoVar = wmkVar2.a;
                                    if (wmoVar.c()) {
                                        aigmVarT = wmoVar.a(iterable);
                                    } else {
                                        if (iterable == tnmVar.c()) {
                                            aigmVarT = tnmVar.b();
                                        } else {
                                            aigmVarT = aigm.T(iterable);
                                        }
                                        aigm aigmVar111117 = aigmVarT;
                                        MessageLite messageLite111117 = wmkVar2.f;
                                        zza zzaVar111117 = wmkVar2.g;
                                        final wmk r1111112 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC111117 = r1111112.c(tnmVar, aigmVar111117, messageLite111117, zzaVar111117, wkwVar);
                                        JniZero.l(afuuVarC2, th1114);
                                        wmnVar.b();
                                        listE = r1111112.e(executor, wlzVarC111117.a, r1111112.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r1111112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite111118;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite111118 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r1111112.d.a(messageLite111118);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r1111112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite111118;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite111118 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r1111112.d.a(messageLite111118);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    }
                                    aigm aigmVar111118 = aigmVarT;
                                    MessageLite messageLite111118 = wmkVar2.f;
                                    zza zzaVar111118 = wmkVar2.g;
                                    final wmk r1111113 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC111118 = r1111113.c(tnmVar, aigmVar111118, messageLite111118, zzaVar111118, wkwVar);
                                    JniZero.l(afuuVarC2, th1114);
                                    wmnVar.b();
                                    listE = r1111113.e(executor, wlzVarC111118.a, r1111113.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r1111113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite111119;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite111119 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r1111113.d.a(messageLite111119);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r1111113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite111119;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite111119 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r1111113.d.a(messageLite111119);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    wmnVar = wmnVar2;
                                    Throwable th1115 = th2;
                                    afuuVarC2 = afwt.c(84, "parseResponseProto");
                                    wmoVar = wmkVar2.a;
                                    if (wmoVar.c()) {
                                        aigmVarT = wmoVar.a(iterable);
                                    } else {
                                        if (iterable == tnmVar.c()) {
                                            aigmVarT = tnmVar.b();
                                        } else {
                                            aigmVarT = aigm.T(iterable);
                                        }
                                        aigm aigmVar111119 = aigmVarT;
                                        MessageLite messageLite111119 = wmkVar2.f;
                                        zza zzaVar111119 = wmkVar2.g;
                                        final wmk r1111114 = wmkVar2;
                                        awrmVar3 = awrmVar2;
                                        wlz wlzVarC111119 = r1111114.c(tnmVar, aigmVar111119, messageLite111119, zzaVar111119, wkwVar);
                                        JniZero.l(afuuVarC2, th1115);
                                        wmnVar.b();
                                        listE = r1111114.e(executor, wlzVarC111119.a, r1111114.e.u);
                                        if (r10 == 0) {
                                            if (listE.isEmpty()) {
                                                r11 = awno.a;
                                            } else {
                                                r3 = listE;
                                            }
                                            list3 = (List) awrmVar3.a;
                                            if (list3 == null) {
                                                list3 = awno.a;
                                            }
                                            afuuVar = afuuVar;
                                            listenableFutureN = r1111114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                                @Override // defpackage.awql
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    MessageLite messageLite1111110;
                                                    tnx tnxVar = (tnx) obj2;
                                                    List list4 = (List) obj3;
                                                    List list5 = (List) obj4;
                                                    tnxVar.getClass();
                                                    list4.getClass();
                                                    list5.getClass();
                                                    boolean z7 = false;
                                                    if (tnxVar.h() && (messageLite1111110 = (MessageLite) tnxVar.c().a) != null) {
                                                        alop alopVar = (alop) r1111114.d.a(messageLite1111110);
                                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    return new tnq(tnxVar, list4, list5, z7);
                                                }
                                            });
                                            afuuVar.a(listenableFutureN);
                                        } else {
                                            r10.addAll(listE);
                                            r11 = r10;
                                        }
                                        r3 = r11;
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r1111114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC111119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite1111110;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite1111110 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r1111114.d.a(messageLite1111110);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    }
                                    aigm aigmVar1111110 = aigmVarT;
                                    MessageLite messageLite1111110 = wmkVar2.f;
                                    zza zzaVar1111110 = wmkVar2.g;
                                    final wmk r1111115 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC1111110 = r1111115.c(tnmVar, aigmVar1111110, messageLite1111110, zzaVar1111110, wkwVar);
                                    JniZero.l(afuuVarC2, th1115);
                                    wmnVar.b();
                                    listE = r1111115.e(executor, wlzVarC1111110.a, r1111115.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r1111115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite1111111;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite1111111 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r1111115.d.a(messageLite1111111);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r1111115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite1111111;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite1111111 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r1111115.d.a(messageLite1111111);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                }
                                JniZero.l(afuuVar, null);
                                return listenableFutureN;
                            }
                            r0 = xplVar.b;
                            r25 = r0;
                            if (iterableJ != null) {
                                hhoVar = new hho((Object) r4, 10, (int[][]) null);
                            } else {
                                hhoVar = null;
                            }
                            if (xplVar != null) {
                                r30 = xplVar.a;
                            } else {
                                r30 = 0;
                            }
                            wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                            wmnVar2 = wmnVar;
                            iterable = wmnVar2.a;
                            if (wmnVar2.d == null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                xxjVar = new xxj(wmnVar2, null);
                                afuuVarC3 = afwt.c(78, "processFutAsync");
                                th2 = null;
                                wmkVar2 = wmkVar;
                                dovVar = wmkVar2.k;
                                zwaVar = wmkVar2.e.u;
                                if (dovVar.a.isEmpty()) {
                                    listenableFutureAq = aher.a;
                                    i2 = 2;
                                    i3 = 0;
                                } else {
                                    i2 = 2;
                                    i3 = 0;
                                    listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                }
                                listenableFuture = listenableFutureAq;
                                afuuVarC3.a(listenableFuture);
                                JniZero.l(afuuVarC3, th2);
                            } else {
                                wmkVar2 = wmkVar;
                                i2 = 2;
                                th2 = null;
                                i3 = 0;
                                albeVarA = wmnVar2.a();
                                if (albeVarA != null) {
                                    afuuVarC = afwt.c(79, "processFutAsync");
                                    ListenableFuture listenableFutureU16 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                    afuuVarC.a(listenableFutureU16);
                                    JniZero.l(afuuVarC, null);
                                    listenableFuture = listenableFutureU16;
                                } else {
                                    listenableFuture = null;
                                }
                            }
                            if (listenableFuture != null) {
                                ArrayList arrayList111 = new ArrayList();
                                arrayList111.add(listenableFuture);
                                r10 = arrayList111;
                            } else {
                                r10 = th2;
                            }
                            apktVar2 = wmnVar2.b;
                            if (apktVar2 != null) {
                                uwkVar = new uwk(arrayList4, 16);
                                awrmVar4 = awrmVar2;
                                uwkVar2 = new uwk(awrmVar4, 17);
                                while (r0.hasNext()) {
                                    th2 = th2;
                                    i4 = apksVar.b;
                                    if ((i4 & 1) != 0) {
                                        i5 = apksVar.c;
                                        if (i5 != 0) {
                                            i6 = 4;
                                        } else if (i5 != i2) {
                                            i6 = 1;
                                        } else if (i5 != 4) {
                                            i6 = 2;
                                        } else if (i5 != 5) {
                                            i6 = i3;
                                        } else {
                                            i6 = 3;
                                        }
                                        if (i6 != 0) {
                                            throw th2;
                                        }
                                        i7 = i6 - 1;
                                        if (i7 != 0) {
                                            if (i7 != 1) {
                                                if (i7 != 2) {
                                                    if (i5 == 5) {
                                                        BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                    } else {
                                                        BooleanValue = i3;
                                                    }
                                                    if (BooleanValue != 0) {
                                                        String str1111 = apksVar.e;
                                                        str1111.getClass();
                                                        uwkVar2.invoke(str1111);
                                                    }
                                                } else if (i7 != 3) {
                                                    throw new awmj();
                                                }
                                            }
                                            th2 = th2;
                                            i2 = 2;
                                        } else if ((i4 & 2) != 0) {
                                            ajnvVar = apksVar.f;
                                            if (ajnvVar == null) {
                                                ajnvVar = ajnv.a;
                                            }
                                            ajnvVar.getClass();
                                            map = tnmVar.e;
                                            uwk uwkVar18 = uwkVar2;
                                            awrmVar2 = awrmVar4;
                                            wmnVar = wmnVar2;
                                            long epochMilli16 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                            tmsVarA = tmt.a();
                                            tmsVarA.f(epochMilli16);
                                            tmsVarA.g(epochMilli16);
                                            tmsVarA.e(j);
                                            if (map == null) {
                                                map = agpn.b;
                                            }
                                            tmsVarA.d(map);
                                            if (true != ajnvVar.e) {
                                                i8 = 1;
                                            } else {
                                                i8 = 2;
                                            }
                                            tmsVarA.d = i8;
                                            if ((ajnvVar.b & 4) != 0) {
                                                tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                            }
                                            tmt tmtVarA16 = tmsVarA.a();
                                            i2 = 2;
                                            if (apksVar.c == 2) {
                                                ajegVar = (ajeg) apksVar.d;
                                            } else {
                                                ajegVar = ajeg.a;
                                            }
                                            aifvVar = ajegVar.b;
                                            if (aifvVar == null) {
                                                aifvVar = aifv.a;
                                            }
                                            byte[] bArrG16 = aifvVar.c.G();
                                            String str1112 = apksVar.e;
                                            str1112.getClass();
                                            uwkVar.invoke(new tne(bArrG16, tmtVarA16, str1112));
                                            uwkVar2 = uwkVar18;
                                            wmnVar2 = wmnVar;
                                            awrmVar4 = awrmVar2;
                                        } else {
                                            i2 = 2;
                                        }
                                        afuuVar = afuuVar;
                                        awrmVar3 = awrmVar2;
                                        twu.c(6, "Failed while attempting to deserialize network response", e);
                                        tnx tnxVarD6 = tnx.d(new tnp(e));
                                        list2 = (List) awrmVar3.a;
                                        if (list2 == null) {
                                            list2 = awno.a;
                                        }
                                        listenableFutureN = ahng.n(new tnq(tnxVarD6, arrayList4, list2, 8));
                                        wmnVar.b();
                                    }
                                    j = 0;
                                }
                                awrmVar2 = awrmVar4;
                                wmnVar = wmnVar2;
                                Throwable th1116 = th2;
                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                wmoVar = wmkVar2.a;
                                if (wmoVar.c()) {
                                    aigmVarT = wmoVar.a(iterable);
                                } else {
                                    if (iterable == tnmVar.c()) {
                                        aigmVarT = tnmVar.b();
                                    } else {
                                        aigmVarT = aigm.T(iterable);
                                    }
                                    aigm aigmVar1111111 = aigmVarT;
                                    MessageLite messageLite1111111 = wmkVar2.f;
                                    zza zzaVar1111111 = wmkVar2.g;
                                    final wmk r1111116 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC1111111 = r1111116.c(tnmVar, aigmVar1111111, messageLite1111111, zzaVar1111111, wkwVar);
                                    JniZero.l(afuuVarC2, th1116);
                                    wmnVar.b();
                                    listE = r1111116.e(executor, wlzVarC1111111.a, r1111116.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r1111116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite1111112;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite1111112 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r1111116.d.a(messageLite1111112);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r1111116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite1111112;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite1111112 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r1111116.d.a(messageLite1111112);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                }
                                aigm aigmVar1111112 = aigmVarT;
                                MessageLite messageLite1111112 = wmkVar2.f;
                                zza zzaVar1111112 = wmkVar2.g;
                                final wmk r1111117 = wmkVar2;
                                awrmVar3 = awrmVar2;
                                wlz wlzVarC1111112 = r1111117.c(tnmVar, aigmVar1111112, messageLite1111112, zzaVar1111112, wkwVar);
                                JniZero.l(afuuVarC2, th1116);
                                wmnVar.b();
                                listE = r1111117.e(executor, wlzVarC1111112.a, r1111117.e.u);
                                if (r10 == 0) {
                                    if (listE.isEmpty()) {
                                        r11 = awno.a;
                                    } else {
                                        r3 = listE;
                                    }
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r1111117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite1111113;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite1111113 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r1111117.d.a(messageLite1111113);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    r10.addAll(listE);
                                    r11 = r10;
                                }
                                r3 = r11;
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r1111117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite1111113;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite1111113 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r1111117.d.a(messageLite1111113);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            } else {
                                wmnVar = wmnVar2;
                                Throwable th1117 = th2;
                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                wmoVar = wmkVar2.a;
                                if (wmoVar.c()) {
                                    aigmVarT = wmoVar.a(iterable);
                                } else {
                                    if (iterable == tnmVar.c()) {
                                        aigmVarT = tnmVar.b();
                                    } else {
                                        aigmVarT = aigm.T(iterable);
                                    }
                                    aigm aigmVar1111113 = aigmVarT;
                                    MessageLite messageLite1111113 = wmkVar2.f;
                                    zza zzaVar1111113 = wmkVar2.g;
                                    final wmk r1111118 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC1111113 = r1111118.c(tnmVar, aigmVar1111113, messageLite1111113, zzaVar1111113, wkwVar);
                                    JniZero.l(afuuVarC2, th1117);
                                    wmnVar.b();
                                    listE = r1111118.e(executor, wlzVarC1111113.a, r1111118.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r1111118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite1111114;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite1111114 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r1111118.d.a(messageLite1111114);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r1111118.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111113, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite1111114;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite1111114 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r1111118.d.a(messageLite1111114);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                }
                                aigm aigmVar1111114 = aigmVarT;
                                MessageLite messageLite1111114 = wmkVar2.f;
                                zza zzaVar1111114 = wmkVar2.g;
                                final wmk r1111119 = wmkVar2;
                                awrmVar3 = awrmVar2;
                                wlz wlzVarC1111114 = r1111119.c(tnmVar, aigmVar1111114, messageLite1111114, zzaVar1111114, wkwVar);
                                JniZero.l(afuuVarC2, th1117);
                                wmnVar.b();
                                listE = r1111119.e(executor, wlzVarC1111114.a, r1111119.e.u);
                                if (r10 == 0) {
                                    if (listE.isEmpty()) {
                                        r11 = awno.a;
                                    } else {
                                        r3 = listE;
                                    }
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r1111119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite1111115;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite1111115 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r1111119.d.a(messageLite1111115);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    r10.addAll(listE);
                                    r11 = r10;
                                }
                                r3 = r11;
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r1111119.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111114, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite1111115;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite1111115 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r1111119.d.a(messageLite1111115);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            }
                            JniZero.l(afuuVar, null);
                            return listenableFutureN;
                        }
                        wmkVar = wmkVar3;
                        z3 = z5;
                        awrmVar2 = awrmVar5;
                        afuuVar = afuuVarC4;
                        arrayList2 = arrayList5;
                        j = 0;
                        xplVar = null;
                        if (xplVar == null) {
                            r0 = C;
                            if (!arrayList.isEmpty()) {
                                arrayList3 = new ArrayList(C.size() + arrayList.size());
                                it = arrayList.iterator();
                                if (it.hasNext()) {
                                    wmmVar = (wmm) it.next();
                                } else {
                                    wmmVar = null;
                                }
                                j2 = j;
                                while (r0.hasNext()) {
                                    long jRemaining9 = ((long) byteBuffer2.remaining()) + j2;
                                    if (wmmVar != null) {
                                        it2 = it;
                                        arrayList3.add(byteBuffer2.duplicate());
                                    } else {
                                        it2 = it;
                                        arrayList3.add(byteBuffer2.duplicate());
                                    }
                                    j2 = jRemaining9;
                                    it = it2;
                                }
                                r25 = arrayList3;
                            }
                            if (iterableJ != null) {
                                hhoVar = new hho((Object) r4, 10, (int[][]) null);
                            } else {
                                hhoVar = null;
                            }
                            if (xplVar != null) {
                                r30 = xplVar.a;
                            } else {
                                r30 = 0;
                            }
                            wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                            wmnVar2 = wmnVar;
                            iterable = wmnVar2.a;
                            if (wmnVar2.d == null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                xxjVar = new xxj(wmnVar2, null);
                                afuuVarC3 = afwt.c(78, "processFutAsync");
                                th2 = null;
                                wmkVar2 = wmkVar;
                                dovVar = wmkVar2.k;
                                zwaVar = wmkVar2.e.u;
                                if (dovVar.a.isEmpty()) {
                                    listenableFutureAq = aher.a;
                                    i2 = 2;
                                    i3 = 0;
                                } else {
                                    i2 = 2;
                                    i3 = 0;
                                    listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                                }
                                listenableFuture = listenableFutureAq;
                                afuuVarC3.a(listenableFuture);
                                JniZero.l(afuuVarC3, th2);
                            } else {
                                wmkVar2 = wmkVar;
                                i2 = 2;
                                th2 = null;
                                i3 = 0;
                                albeVarA = wmnVar2.a();
                                if (albeVarA != null) {
                                    afuuVarC = afwt.c(79, "processFutAsync");
                                    ListenableFuture listenableFutureU17 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                    afuuVarC.a(listenableFutureU17);
                                    JniZero.l(afuuVarC, null);
                                    listenableFuture = listenableFutureU17;
                                } else {
                                    listenableFuture = null;
                                }
                            }
                            if (listenableFuture != null) {
                                ArrayList arrayList112 = new ArrayList();
                                arrayList112.add(listenableFuture);
                                r10 = arrayList112;
                            } else {
                                r10 = th2;
                            }
                            apktVar2 = wmnVar2.b;
                            if (apktVar2 != null) {
                                uwkVar = new uwk(arrayList4, 16);
                                awrmVar4 = awrmVar2;
                                uwkVar2 = new uwk(awrmVar4, 17);
                                while (r0.hasNext()) {
                                    th2 = th2;
                                    i4 = apksVar.b;
                                    if ((i4 & 1) != 0) {
                                        i5 = apksVar.c;
                                        if (i5 != 0) {
                                            i6 = 4;
                                        } else if (i5 != i2) {
                                            i6 = 1;
                                        } else if (i5 != 4) {
                                            i6 = 2;
                                        } else if (i5 != 5) {
                                            i6 = i3;
                                        } else {
                                            i6 = 3;
                                        }
                                        if (i6 != 0) {
                                            throw th2;
                                        }
                                        i7 = i6 - 1;
                                        if (i7 != 0) {
                                            if (i7 != 1) {
                                                if (i7 != 2) {
                                                    if (i5 == 5) {
                                                        BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                    } else {
                                                        BooleanValue = i3;
                                                    }
                                                    if (BooleanValue != 0) {
                                                        String str1113 = apksVar.e;
                                                        str1113.getClass();
                                                        uwkVar2.invoke(str1113);
                                                    }
                                                } else if (i7 != 3) {
                                                    throw new awmj();
                                                }
                                            }
                                            th2 = th2;
                                            i2 = 2;
                                        } else if ((i4 & 2) != 0) {
                                            ajnvVar = apksVar.f;
                                            if (ajnvVar == null) {
                                                ajnvVar = ajnv.a;
                                            }
                                            ajnvVar.getClass();
                                            map = tnmVar.e;
                                            uwk uwkVar19 = uwkVar2;
                                            awrmVar2 = awrmVar4;
                                            wmnVar = wmnVar2;
                                            long epochMilli17 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                            tmsVarA = tmt.a();
                                            tmsVarA.f(epochMilli17);
                                            tmsVarA.g(epochMilli17);
                                            tmsVarA.e(j);
                                            if (map == null) {
                                                map = agpn.b;
                                            }
                                            tmsVarA.d(map);
                                            if (true != ajnvVar.e) {
                                                i8 = 1;
                                            } else {
                                                i8 = 2;
                                            }
                                            tmsVarA.d = i8;
                                            if ((ajnvVar.b & 4) != 0) {
                                                tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                            }
                                            tmt tmtVarA17 = tmsVarA.a();
                                            i2 = 2;
                                            if (apksVar.c == 2) {
                                                ajegVar = (ajeg) apksVar.d;
                                            } else {
                                                ajegVar = ajeg.a;
                                            }
                                            aifvVar = ajegVar.b;
                                            if (aifvVar == null) {
                                                aifvVar = aifv.a;
                                            }
                                            byte[] bArrG17 = aifvVar.c.G();
                                            String str1114 = apksVar.e;
                                            str1114.getClass();
                                            uwkVar.invoke(new tne(bArrG17, tmtVarA17, str1114));
                                            uwkVar2 = uwkVar19;
                                            wmnVar2 = wmnVar;
                                            awrmVar4 = awrmVar2;
                                        } else {
                                            i2 = 2;
                                        }
                                    }
                                    j = 0;
                                }
                                awrmVar2 = awrmVar4;
                                wmnVar = wmnVar2;
                                Throwable th1118 = th2;
                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                wmoVar = wmkVar2.a;
                                if (wmoVar.c()) {
                                    aigmVarT = wmoVar.a(iterable);
                                } else {
                                    if (iterable == tnmVar.c()) {
                                        aigmVarT = tnmVar.b();
                                    } else {
                                        aigmVarT = aigm.T(iterable);
                                    }
                                    aigm aigmVar1111115 = aigmVarT;
                                    MessageLite messageLite1111115 = wmkVar2.f;
                                    zza zzaVar1111115 = wmkVar2.g;
                                    final wmk r11111110 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC1111115 = r11111110.c(tnmVar, aigmVar1111115, messageLite1111115, zzaVar1111115, wkwVar);
                                    JniZero.l(afuuVarC2, th1118);
                                    wmnVar.b();
                                    listE = r11111110.e(executor, wlzVarC1111115.a, r11111110.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r11111110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite1111116;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite1111116 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r11111110.d.a(messageLite1111116);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r11111110.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111115, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite1111116;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite1111116 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r11111110.d.a(messageLite1111116);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                }
                                aigm aigmVar1111116 = aigmVarT;
                                MessageLite messageLite1111116 = wmkVar2.f;
                                zza zzaVar1111116 = wmkVar2.g;
                                final wmk r11111111 = wmkVar2;
                                awrmVar3 = awrmVar2;
                                wlz wlzVarC1111116 = r11111111.c(tnmVar, aigmVar1111116, messageLite1111116, zzaVar1111116, wkwVar);
                                JniZero.l(afuuVarC2, th1118);
                                wmnVar.b();
                                listE = r11111111.e(executor, wlzVarC1111116.a, r11111111.e.u);
                                if (r10 == 0) {
                                    if (listE.isEmpty()) {
                                        r11 = awno.a;
                                    } else {
                                        r3 = listE;
                                    }
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r11111111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite1111117;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite1111117 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r11111111.d.a(messageLite1111117);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    r10.addAll(listE);
                                    r11 = r10;
                                }
                                r3 = r11;
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r11111111.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111116, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite1111117;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite1111117 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r11111111.d.a(messageLite1111117);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            } else {
                                wmnVar = wmnVar2;
                                Throwable th1119 = th2;
                                afuuVarC2 = afwt.c(84, "parseResponseProto");
                                wmoVar = wmkVar2.a;
                                if (wmoVar.c()) {
                                    aigmVarT = wmoVar.a(iterable);
                                } else {
                                    if (iterable == tnmVar.c()) {
                                        aigmVarT = tnmVar.b();
                                    } else {
                                        aigmVarT = aigm.T(iterable);
                                    }
                                    aigm aigmVar1111117 = aigmVarT;
                                    MessageLite messageLite1111117 = wmkVar2.f;
                                    zza zzaVar1111117 = wmkVar2.g;
                                    final wmk r11111112 = wmkVar2;
                                    awrmVar3 = awrmVar2;
                                    wlz wlzVarC1111117 = r11111112.c(tnmVar, aigmVar1111117, messageLite1111117, zzaVar1111117, wkwVar);
                                    JniZero.l(afuuVarC2, th1119);
                                    wmnVar.b();
                                    listE = r11111112.e(executor, wlzVarC1111117.a, r11111112.e.u);
                                    if (r10 == 0) {
                                        if (listE.isEmpty()) {
                                            r11 = awno.a;
                                        } else {
                                            r3 = listE;
                                        }
                                        list3 = (List) awrmVar3.a;
                                        if (list3 == null) {
                                            list3 = awno.a;
                                        }
                                        afuuVar = afuuVar;
                                        listenableFutureN = r11111112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                            @Override // defpackage.awql
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                MessageLite messageLite1111118;
                                                tnx tnxVar = (tnx) obj2;
                                                List list4 = (List) obj3;
                                                List list5 = (List) obj4;
                                                tnxVar.getClass();
                                                list4.getClass();
                                                list5.getClass();
                                                boolean z7 = false;
                                                if (tnxVar.h() && (messageLite1111118 = (MessageLite) tnxVar.c().a) != null) {
                                                    alop alopVar = (alop) r11111112.d.a(messageLite1111118);
                                                    if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                        z7 = true;
                                                    }
                                                }
                                                return new tnq(tnxVar, list4, list5, z7);
                                            }
                                        });
                                        afuuVar.a(listenableFutureN);
                                    } else {
                                        r10.addAll(listE);
                                        r11 = r10;
                                    }
                                    r3 = r11;
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r11111112.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111117, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite1111118;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite1111118 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r11111112.d.a(messageLite1111118);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                }
                                aigm aigmVar1111118 = aigmVarT;
                                MessageLite messageLite1111118 = wmkVar2.f;
                                zza zzaVar1111118 = wmkVar2.g;
                                final wmk r11111113 = wmkVar2;
                                awrmVar3 = awrmVar2;
                                wlz wlzVarC1111118 = r11111113.c(tnmVar, aigmVar1111118, messageLite1111118, zzaVar1111118, wkwVar);
                                JniZero.l(afuuVarC2, th1119);
                                wmnVar.b();
                                listE = r11111113.e(executor, wlzVarC1111118.a, r11111113.e.u);
                                if (r10 == 0) {
                                    if (listE.isEmpty()) {
                                        r11 = awno.a;
                                    } else {
                                        r3 = listE;
                                    }
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r11111113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite1111119;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite1111119 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r11111113.d.a(messageLite1111119);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    r10.addAll(listE);
                                    r11 = r10;
                                }
                                r3 = r11;
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r11111113.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111118, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite1111119;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite1111119 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r11111113.d.a(messageLite1111119);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            }
                            JniZero.l(afuuVar, null);
                            return listenableFutureN;
                        }
                        r0 = xplVar.b;
                        r25 = r0;
                        if (iterableJ != null) {
                            hhoVar = new hho((Object) r4, 10, (int[][]) null);
                        } else {
                            hhoVar = null;
                        }
                        if (xplVar != null) {
                            r30 = xplVar.a;
                        } else {
                            r30 = 0;
                        }
                        wmnVar = new wmn(r25, apktVar, albeVar, iterableJ, hhoVar, r30);
                        wmnVar2 = wmnVar;
                        iterable = wmnVar2.a;
                        if (wmnVar2.d == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            xxjVar = new xxj(wmnVar2, null);
                            afuuVarC3 = afwt.c(78, "processFutAsync");
                            th2 = null;
                            wmkVar2 = wmkVar;
                            dovVar = wmkVar2.k;
                            zwaVar = wmkVar2.e.u;
                            if (dovVar.a.isEmpty()) {
                                listenableFutureAq = aher.a;
                                i2 = 2;
                                i3 = 0;
                            } else {
                                i2 = 2;
                                i3 = 0;
                                listenableFutureAq = ahno.aq(new ojj(dovVar, executor, zwaVar, xxjVar, 6), executor);
                            }
                            listenableFuture = listenableFutureAq;
                            afuuVarC3.a(listenableFuture);
                            JniZero.l(afuuVarC3, th2);
                        } else {
                            wmkVar2 = wmkVar;
                            i2 = 2;
                            th2 = null;
                            i3 = 0;
                            albeVarA = wmnVar2.a();
                            if (albeVarA != null) {
                                afuuVarC = afwt.c(79, "processFutAsync");
                                ListenableFuture listenableFutureU18 = wmkVar2.k.U(executor, wmkVar2.e.u, albeVarA);
                                afuuVarC.a(listenableFutureU18);
                                JniZero.l(afuuVarC, null);
                                listenableFuture = listenableFutureU18;
                            } else {
                                listenableFuture = null;
                            }
                        }
                        if (listenableFuture != null) {
                            ArrayList arrayList113 = new ArrayList();
                            arrayList113.add(listenableFuture);
                            r10 = arrayList113;
                        } else {
                            r10 = th2;
                        }
                        apktVar2 = wmnVar2.b;
                        if (apktVar2 != null) {
                            uwkVar = new uwk(arrayList4, 16);
                            awrmVar4 = awrmVar2;
                            uwkVar2 = new uwk(awrmVar4, 17);
                            while (r0.hasNext()) {
                                th2 = th2;
                                i4 = apksVar.b;
                                if ((i4 & 1) != 0) {
                                    i5 = apksVar.c;
                                    if (i5 != 0) {
                                        i6 = 4;
                                    } else if (i5 != i2) {
                                        i6 = 1;
                                    } else if (i5 != 4) {
                                        i6 = 2;
                                    } else if (i5 != 5) {
                                        i6 = i3;
                                    } else {
                                        i6 = 3;
                                    }
                                    if (i6 != 0) {
                                        throw th2;
                                    }
                                    i7 = i6 - 1;
                                    if (i7 != 0) {
                                        if (i7 != 1) {
                                            if (i7 != 2) {
                                                if (i5 == 5) {
                                                    BooleanValue = ((Boolean) apksVar.d).booleanValue();
                                                } else {
                                                    BooleanValue = i3;
                                                }
                                                if (BooleanValue != 0) {
                                                    String str1115 = apksVar.e;
                                                    str1115.getClass();
                                                    uwkVar2.invoke(str1115);
                                                }
                                            } else if (i7 != 3) {
                                                throw new awmj();
                                            }
                                        }
                                        th2 = th2;
                                        i2 = 2;
                                    } else if ((i4 & 2) != 0) {
                                        ajnvVar = apksVar.f;
                                        if (ajnvVar == null) {
                                            ajnvVar = ajnv.a;
                                        }
                                        ajnvVar.getClass();
                                        map = tnmVar.e;
                                        uwk uwkVar110 = uwkVar2;
                                        awrmVar2 = awrmVar4;
                                        wmnVar = wmnVar2;
                                        long epochMilli18 = wmkVar2.c.f().plusSeconds(ajnvVar.c).toEpochMilli();
                                        tmsVarA = tmt.a();
                                        tmsVarA.f(epochMilli18);
                                        tmsVarA.g(epochMilli18);
                                        tmsVarA.e(j);
                                        if (map == null) {
                                            map = agpn.b;
                                        }
                                        tmsVarA.d(map);
                                        if (true != ajnvVar.e) {
                                            i8 = 1;
                                        } else {
                                            i8 = 2;
                                        }
                                        tmsVarA.d = i8;
                                        if ((ajnvVar.b & 4) != 0) {
                                            tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
                                        }
                                        tmt tmtVarA18 = tmsVarA.a();
                                        i2 = 2;
                                        if (apksVar.c == 2) {
                                            ajegVar = (ajeg) apksVar.d;
                                        } else {
                                            ajegVar = ajeg.a;
                                        }
                                        aifvVar = ajegVar.b;
                                        if (aifvVar == null) {
                                            aifvVar = aifv.a;
                                        }
                                        byte[] bArrG18 = aifvVar.c.G();
                                        String str1116 = apksVar.e;
                                        str1116.getClass();
                                        uwkVar.invoke(new tne(bArrG18, tmtVarA18, str1116));
                                        uwkVar2 = uwkVar110;
                                        wmnVar2 = wmnVar;
                                        awrmVar4 = awrmVar2;
                                    } else {
                                        i2 = 2;
                                    }
                                    afuuVar = afuuVar;
                                    awrmVar3 = awrmVar2;
                                    twu.c(6, "Failed while attempting to deserialize network response", e);
                                    tnx tnxVarD7 = tnx.d(new tnp(e));
                                    list2 = (List) awrmVar3.a;
                                    if (list2 == null) {
                                        list2 = awno.a;
                                    }
                                    listenableFutureN = ahng.n(new tnq(tnxVarD7, arrayList4, list2, 8));
                                    wmnVar.b();
                                }
                                j = 0;
                            }
                            awrmVar2 = awrmVar4;
                            wmnVar = wmnVar2;
                            Throwable th11110 = th2;
                            afuuVarC2 = afwt.c(84, "parseResponseProto");
                            wmoVar = wmkVar2.a;
                            if (wmoVar.c()) {
                                aigmVarT = wmoVar.a(iterable);
                            } else {
                                if (iterable == tnmVar.c()) {
                                    aigmVarT = tnmVar.b();
                                } else {
                                    aigmVarT = aigm.T(iterable);
                                }
                                aigm aigmVar1111119 = aigmVarT;
                                MessageLite messageLite1111119 = wmkVar2.f;
                                zza zzaVar1111119 = wmkVar2.g;
                                final wmk r11111114 = wmkVar2;
                                awrmVar3 = awrmVar2;
                                wlz wlzVarC1111119 = r11111114.c(tnmVar, aigmVar1111119, messageLite1111119, zzaVar1111119, wkwVar);
                                JniZero.l(afuuVarC2, th11110);
                                wmnVar.b();
                                listE = r11111114.e(executor, wlzVarC1111119.a, r11111114.e.u);
                                if (r10 == 0) {
                                    if (listE.isEmpty()) {
                                        r11 = awno.a;
                                    } else {
                                        r3 = listE;
                                    }
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r11111114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite11111110;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite11111110 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r11111114.d.a(messageLite11111110);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    r10.addAll(listE);
                                    r11 = r10;
                                }
                                r3 = r11;
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r11111114.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC1111119, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite11111110;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite11111110 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r11111114.d.a(messageLite11111110);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            }
                            aigm aigmVar11111110 = aigmVarT;
                            MessageLite messageLite11111110 = wmkVar2.f;
                            zza zzaVar11111110 = wmkVar2.g;
                            final wmk r11111115 = wmkVar2;
                            awrmVar3 = awrmVar2;
                            wlz wlzVarC11111110 = r11111115.c(tnmVar, aigmVar11111110, messageLite11111110, zzaVar11111110, wkwVar);
                            JniZero.l(afuuVarC2, th11110);
                            wmnVar.b();
                            listE = r11111115.e(executor, wlzVarC11111110.a, r11111115.e.u);
                            if (r10 == 0) {
                                if (listE.isEmpty()) {
                                    r11 = awno.a;
                                } else {
                                    r3 = listE;
                                }
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r11111115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite11111111;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite11111111 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r11111115.d.a(messageLite11111111);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            } else {
                                r10.addAll(listE);
                                r11 = r10;
                            }
                            r3 = r11;
                            list3 = (List) awrmVar3.a;
                            if (list3 == null) {
                                list3 = awno.a;
                            }
                            afuuVar = afuuVar;
                            listenableFutureN = r11111115.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111110, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                @Override // defpackage.awql
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    MessageLite messageLite11111111;
                                    tnx tnxVar = (tnx) obj2;
                                    List list4 = (List) obj3;
                                    List list5 = (List) obj4;
                                    tnxVar.getClass();
                                    list4.getClass();
                                    list5.getClass();
                                    boolean z7 = false;
                                    if (tnxVar.h() && (messageLite11111111 = (MessageLite) tnxVar.c().a) != null) {
                                        alop alopVar = (alop) r11111115.d.a(messageLite11111111);
                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                            z7 = true;
                                        }
                                    }
                                    return new tnq(tnxVar, list4, list5, z7);
                                }
                            });
                            afuuVar.a(listenableFutureN);
                        } else {
                            wmnVar = wmnVar2;
                            Throwable th11111 = th2;
                            afuuVarC2 = afwt.c(84, "parseResponseProto");
                            wmoVar = wmkVar2.a;
                            if (wmoVar.c()) {
                                aigmVarT = wmoVar.a(iterable);
                            } else {
                                if (iterable == tnmVar.c()) {
                                    aigmVarT = tnmVar.b();
                                } else {
                                    aigmVarT = aigm.T(iterable);
                                }
                                aigm aigmVar11111111 = aigmVarT;
                                MessageLite messageLite11111111 = wmkVar2.f;
                                zza zzaVar11111111 = wmkVar2.g;
                                final wmk r11111116 = wmkVar2;
                                awrmVar3 = awrmVar2;
                                wlz wlzVarC11111111 = r11111116.c(tnmVar, aigmVar11111111, messageLite11111111, zzaVar11111111, wkwVar);
                                JniZero.l(afuuVarC2, th11111);
                                wmnVar.b();
                                listE = r11111116.e(executor, wlzVarC11111111.a, r11111116.e.u);
                                if (r10 == 0) {
                                    if (listE.isEmpty()) {
                                        r11 = awno.a;
                                    } else {
                                        r3 = listE;
                                    }
                                    list3 = (List) awrmVar3.a;
                                    if (list3 == null) {
                                        list3 = awno.a;
                                    }
                                    afuuVar = afuuVar;
                                    listenableFutureN = r11111116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                        @Override // defpackage.awql
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            MessageLite messageLite11111112;
                                            tnx tnxVar = (tnx) obj2;
                                            List list4 = (List) obj3;
                                            List list5 = (List) obj4;
                                            tnxVar.getClass();
                                            list4.getClass();
                                            list5.getClass();
                                            boolean z7 = false;
                                            if (tnxVar.h() && (messageLite11111112 = (MessageLite) tnxVar.c().a) != null) {
                                                alop alopVar = (alop) r11111116.d.a(messageLite11111112);
                                                if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                    z7 = true;
                                                }
                                            }
                                            return new tnq(tnxVar, list4, list5, z7);
                                        }
                                    });
                                    afuuVar.a(listenableFutureN);
                                } else {
                                    r10.addAll(listE);
                                    r11 = r10;
                                }
                                r3 = r11;
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r11111116.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111111, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite11111112;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite11111112 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r11111116.d.a(messageLite11111112);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            }
                            aigm aigmVar11111112 = aigmVarT;
                            MessageLite messageLite11111112 = wmkVar2.f;
                            zza zzaVar11111112 = wmkVar2.g;
                            final wmk r11111117 = wmkVar2;
                            awrmVar3 = awrmVar2;
                            wlz wlzVarC11111112 = r11111117.c(tnmVar, aigmVar11111112, messageLite11111112, zzaVar11111112, wkwVar);
                            JniZero.l(afuuVarC2, th11111);
                            wmnVar.b();
                            listE = r11111117.e(executor, wlzVarC11111112.a, r11111117.e.u);
                            if (r10 == 0) {
                                if (listE.isEmpty()) {
                                    r11 = awno.a;
                                } else {
                                    r3 = listE;
                                }
                                list3 = (List) awrmVar3.a;
                                if (list3 == null) {
                                    list3 = awno.a;
                                }
                                afuuVar = afuuVar;
                                listenableFutureN = r11111117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                    @Override // defpackage.awql
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        MessageLite messageLite11111113;
                                        tnx tnxVar = (tnx) obj2;
                                        List list4 = (List) obj3;
                                        List list5 = (List) obj4;
                                        tnxVar.getClass();
                                        list4.getClass();
                                        list5.getClass();
                                        boolean z7 = false;
                                        if (tnxVar.h() && (messageLite11111113 = (MessageLite) tnxVar.c().a) != null) {
                                            alop alopVar = (alop) r11111117.d.a(messageLite11111113);
                                            if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                                z7 = true;
                                            }
                                        }
                                        return new tnq(tnxVar, list4, list5, z7);
                                    }
                                });
                                afuuVar.a(listenableFutureN);
                            } else {
                                r10.addAll(listE);
                                r11 = r10;
                            }
                            r3 = r11;
                            list3 = (List) awrmVar3.a;
                            if (list3 == null) {
                                list3 = awno.a;
                            }
                            afuuVar = afuuVar;
                            listenableFutureN = r11111117.d(r3, jA, tnmVar, this, wkwVar, z, i, z3, wlzVarC11111112, arrayList4, list3, arrayList2, z4, new awql() { // from class: wmj
                                @Override // defpackage.awql
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    MessageLite messageLite11111113;
                                    tnx tnxVar = (tnx) obj2;
                                    List list4 = (List) obj3;
                                    List list5 = (List) obj4;
                                    tnxVar.getClass();
                                    list4.getClass();
                                    list5.getClass();
                                    boolean z7 = false;
                                    if (tnxVar.h() && (messageLite11111113 = (MessageLite) tnxVar.c().a) != null) {
                                        alop alopVar = (alop) r11111117.d.a(messageLite11111113);
                                        if (awrc.c(alopVar != null ? Boolean.valueOf(alopVar.m) : null, Boolean.TRUE)) {
                                            z7 = true;
                                        }
                                    }
                                    return new tnq(tnxVar, list4, list5, z7);
                                }
                            });
                            afuuVar.a(listenableFutureN);
                        }
                        JniZero.l(afuuVar, null);
                        return listenableFutureN;
                    } catch (IOException e10) {
                        e = e10;
                        awrmVar = awrmVar5;
                        afuuVar = afuuVarC4;
                    }
                    throw th;
                } catch (Throwable th33) {
                    JniZero.l(r1, th);
                    throw th33;
                }
            } catch (Throwable th34) {
                th = th34;
            }
        } catch (Throwable th35) {
            th = th35;
            obj = afuuVarC4;
        }
    }

    @Override // defpackage.tmn, defpackage.tns
    public final aqrv m() {
        aqrv aqrvVar = this.m.c.b().y;
        return aqrvVar == null ? aqrv.a : aqrvVar;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final Optional n() {
        return this.l.v;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final String q() {
        return this.m.b();
    }

    @Override // defpackage.tmn, defpackage.tns
    public final String r() {
        return this.l.z;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final String s() {
        return this.m.d();
    }

    @Override // defpackage.zyn, defpackage.tmn, defpackage.tns
    public final List v() {
        ArrayList arrayList = new ArrayList();
        wmf wmfVar = this.m;
        arrayList.add("Request type: " + wmfVar.b.getClass().getSimpleName() + '\n');
        arrayList.add("Cached: CACHE READ " + (true != wmfVar.a.w() ? "DISABLED" : "ENABLED") + '\n');
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("curl ");
            for (Map.Entry entry : wmfVar.e().entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!str.equals("Content-Type")) {
                    sb.append("-H \"");
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    sb.append("\" ");
                }
            }
        } catch (tmg e) {
            twu.c(4, "Curl command line not available", e);
        }
        aiir aiirVarA = wmfVar.a.a();
        if (aiirVarA != null) {
            String string = yno.ej(wmfVar.a(aiirVarA)).toString();
            sb.append("-H \"Content-Type:application/json\" -d '");
            sb.append(string.replace("'", "'\\''"));
            sb.append("' '");
        }
        sb.append(wmfVar.d().replace("'", "'\\''"));
        sb.append('\'');
        arrayList.addAll(typ.e(sb.toString(), 4000));
        return arrayList;
    }

    @Override // defpackage.tnz
    public final void g() {
    }
}
