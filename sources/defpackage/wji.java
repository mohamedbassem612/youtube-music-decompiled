package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wji implements wjf {
    public static final Parcelable.Creator CREATOR = new uwz(14);
    public alvt a;
    public final long b;
    public final wja c;
    protected wjf d;
    protected List e;
    protected aiut f;
    protected aiux g;
    protected aiwa h;
    public final wjh i;
    private Instant j;
    private wje k;
    private wiu l;
    private List m;
    private aopm n;
    private boolean o;
    private boolean p;
    private xpl q;

    @Deprecated
    public wji(wja wjaVar, wje wjeVar, wiu wiuVar) {
        this.e = new ArrayList();
        this.p = false;
        aihh aihhVar = (aihh) alvt.a.createBuilder();
        aihf aihfVarCreateBuilder = alvw.a.createBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = wjaVar.h / 1000;
        aihfVarCreateBuilder.copyOnWrite();
        alvw alvwVar = (alvw) aihfVarCreateBuilder.instance;
        alvwVar.b |= 4;
        alvwVar.e = j;
        aihhVar.copyOnWrite();
        alvt alvtVar = (alvt) aihhVar.instance;
        alvw alvwVar2 = (alvw) aihfVarCreateBuilder.build();
        alvwVar2.getClass();
        alvtVar.g = alvwVar2;
        alvtVar.b |= 8;
        this.a = (alvt) aihhVar.build();
        wjaVar.getClass();
        this.c = wjaVar;
        this.b = wjaVar.i;
        wjeVar.getClass();
        this.k = wjeVar;
        wiuVar.getClass();
        this.l = wiuVar;
        this.i = new wjh();
    }

    @Deprecated
    public static wja ai(wjb wjbVar, alvt alvtVar, long j) {
        wjbVar.getClass();
        alvf alvfVar = alvtVar.i;
        if (alvfVar == null) {
            alvfVar = alvf.a;
        }
        String str = alvfVar.f;
        if ((alvtVar.b & 16) == 0) {
            return null;
        }
        wiy wiyVar = new wiy(alvtVar);
        wiyVar.b(j);
        wiyVar.f = str;
        wiyVar.j = wjbVar.c;
        return wiyVar.a();
    }

    public static wjf aj(byte[] bArr, long j) {
        alvt alvtVar;
        if (bArr == null || (alvtVar = (alvt) wjr.F(bArr, alvt.a)) == null) {
            return null;
        }
        return new wji(alvtVar, j, wjb.a);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static wjf ak(byte[] bArr, long j) {
        wlr wlrVar;
        albe albeVarY;
        wld wldVar;
        if (bArr == null) {
            return null;
        }
        alvt alvtVar = alvt.a;
        wjr wjrVar = wjr.c;
        if (wjrVar != null) {
            zwa zwaVarE = wjrVar.a.e();
            alvtVar.getClass();
            zwaVarE.getClass();
            try {
                ?? H = alvtVar.getParserForType().h(bArr, ExtensionRegistryLite.getGeneratedRegistry());
                dov dovVar = (dov) wjrVar.b.io();
                Class<?> cls = alvtVar.getClass();
                ?? r2 = dovVar.a;
                if (r2.isEmpty() || (albeVarY = dov.Y(aigm.M(bArr), cls)) == null) {
                    wldVar = wld.t();
                } else {
                    agjz agjzVar = new agjz(4);
                    for (wlc wlcVar : r2) {
                        try {
                            String.format("[TRANSPORT] About to validate and process packet with %s", wlcVar.getClass().getSimpleName());
                            wle wleVar = wlcVar.a(zwaVarE, albeVarY).b;
                            if (wleVar != null) {
                                agjzVar.h(wleVar);
                            }
                        } catch (Throwable th) {
                            dov.X(th);
                            agjzVar.h(new wle(0, th.getMessage()));
                        }
                    }
                    wldVar = new wld(agjzVar.g());
                }
                wlrVar = new wlr(H, Optional.of(wldVar));
            } catch (aiik e) {
                twu.c(6, "Exception while parsing InnerTube response", e);
                wlrVar = null;
            }
        } else {
            wlrVar = new wlr(wjr.G(bArr, alvtVar), Optional.empty());
        }
        if (wlrVar == null) {
            return null;
        }
        Optional optionalOfNullable = wlrVar.b;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((wld) optionalOfNullable.get()).a.isEmpty()));
        }
        if (((Boolean) optionalOfNullable.orElse(Boolean.TRUE)).booleanValue()) {
            return new wji((alvt) wlrVar.a, j, wjb.a);
        }
        return null;
    }

    @Override // defpackage.wjf
    public final String A() {
        alvt alvtVar = this.a;
        if ((alvtVar.b & 131072) != 0) {
            return alvtVar.v;
        }
        return null;
    }

    @Override // defpackage.wjf
    public final String B() {
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        return alvwVar.n;
    }

    @Override // defpackage.wjf
    public final String C() {
        aoqd aoqdVar = this.a.e;
        if (aoqdVar == null) {
            aoqdVar = aoqd.a;
        }
        if ((aoqdVar.c & 268435456) == 0) {
            return "";
        }
        aoqd aoqdVar2 = this.a.e;
        if (aoqdVar2 == null) {
            aoqdVar2 = aoqd.a;
        }
        akcu akcuVar = aoqdVar2.I;
        if (akcuVar == null) {
            akcuVar = akcu.a;
        }
        return akcuVar.c;
    }

    @Override // defpackage.wjf
    public final String D() {
        alvv alvvVar = this.a.q;
        if (alvvVar == null) {
            alvvVar = alvv.a;
        }
        if (alvvVar.b != 70276274) {
            return null;
        }
        alvv alvvVar2 = this.a.q;
        if (alvvVar2 == null) {
            alvvVar2 = alvv.a;
        }
        return (alvvVar2.b == 70276274 ? (aoqz) alvvVar2.c : aoqz.a).b;
    }

    @Override // defpackage.wjf
    public final String E() {
        alvv alvvVar = this.a.q;
        if (alvvVar == null) {
            alvvVar = alvv.a;
        }
        if (alvvVar.b != 55735497) {
            return null;
        }
        alvv alvvVar2 = this.a.q;
        if (alvvVar2 == null) {
            alvvVar2 = alvv.a;
        }
        return (alvvVar2.b == 55735497 ? (aosn) alvvVar2.c : aosn.a).b;
    }

    @Override // defpackage.wjf
    public final String F() {
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        return alvwVar.d;
    }

    @Override // defpackage.wjf
    public final String G() {
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        return alvwVar.c;
    }

    @Override // defpackage.wjf
    public final List H() {
        List<alvn> listAl = al();
        if (this.e.isEmpty() && listAl != null) {
            for (alvn alvnVar : listAl) {
                int i = alvnVar.b;
                if (i == 84813246) {
                    this.e.add(i == 84813246 ? (aisu) alvnVar.c : aisu.a);
                }
            }
        }
        return this.e;
    }

    @Override // defpackage.wjf
    public final List I() {
        if (this.m == null) {
            this.m = this.a.D;
        }
        return this.m;
    }

    @Override // defpackage.wjf
    public final void J(boolean z) {
        this.o = z;
    }

    @Override // defpackage.wjf
    public final boolean K(wjb wjbVar) {
        alvl alvlVarT = t();
        if (alvlVarT != null && (alvlVarT.b & 524288) != 0) {
            aony aonyVarA = aony.a(alvlVarT.c);
            if (aonyVarA == null) {
                aonyVarA = aony.OK;
            }
            if (aonyVarA == aony.LIVE_STREAM_OFFLINE && ah(wjbVar) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wjf
    public final boolean L() {
        aisu aisuVarM = m();
        if (aisuVarM != null) {
            Iterator it = aisuVarM.e.iterator();
            while (it.hasNext()) {
                if ((((aisv) it.next()).b & 4) != 0) {
                    return true;
                }
            }
        }
        Iterator it2 = this.a.n.iterator();
        while (it2.hasNext()) {
            aivt aivtVar = (aivt) aavv.s((apji) it2.next(), aivv.a);
            if (aivtVar != null) {
                aivs aivsVar = aivtVar.c;
                if (aivsVar == null) {
                    aivsVar = aivs.a;
                }
                int iBf = a.bf(aivsVar.g);
                if (iBf == 0) {
                    iBf = 1;
                }
                if (iBf != 2) {
                    continue;
                } else {
                    aivu aivuVar = aivtVar.e;
                    if (aivuVar == null) {
                        aivuVar = aivu.a;
                    }
                    apji apjiVar = aivuVar.b;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aopn aopnVar = (aopn) aavv.s(apjiVar, aopo.a);
                    if (aopnVar != null) {
                        aiuc aiucVar = aopnVar.c;
                        if (aiucVar == null) {
                            aiucVar = aiuc.a;
                        }
                        aixg aixgVarA = aixg.a(aiucVar.d);
                        if (aixgVarA == null) {
                            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                        }
                        if (aixgVarA == aixg.LAYOUT_TYPE_MEDIA_BREAK) {
                            apji apjiVar2 = aopnVar.d;
                            if (apjiVar2 == null) {
                                apjiVar2 = apji.a;
                            }
                            if (aavv.s(apjiVar2, aqfy.a) != null) {
                                return true;
                            }
                        }
                    }
                    if (aopnVar == null) {
                        continue;
                    } else {
                        aiuc aiucVar2 = aopnVar.c;
                        if (aiucVar2 == null) {
                            aiucVar2 = aiuc.a;
                        }
                        aixg aixgVarA2 = aixg.a(aiucVar2.d);
                        if (aixgVarA2 == null) {
                            aixgVarA2 = aixg.LAYOUT_TYPE_UNSPECIFIED;
                        }
                        if (aixgVarA2 != aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES) {
                            continue;
                        } else {
                            apji apjiVar3 = aopnVar.d;
                            if (apjiVar3 == null) {
                                apjiVar3 = apji.a;
                            }
                            aopr aoprVar = (aopr) aavv.s(apjiVar3, aops.a);
                            if (aoprVar != null) {
                                Iterator it3 = aoprVar.b.iterator();
                                while (it3.hasNext()) {
                                    aopn aopnVar2 = (aopn) aavv.s((apji) it3.next(), aopo.a);
                                    if (aopnVar2 != null) {
                                        apji apjiVar4 = aopnVar2.d;
                                        if (apjiVar4 == null) {
                                            apjiVar4 = apji.a;
                                        }
                                        if (aavv.s(apjiVar4, aqfy.a) != null) {
                                            return true;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.wjf
    public final boolean M() {
        return f() != null && f().as();
    }

    @Override // defpackage.wjf
    public final boolean N() {
        return this.p;
    }

    @Override // defpackage.wjf
    public final boolean O() {
        return f() != null && f().au();
    }

    @Override // defpackage.wjf
    public final boolean P() {
        return f().av();
    }

    @Override // defpackage.wjf
    public final boolean Q() {
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        return alvwVar.q;
    }

    @Override // defpackage.wjf
    public final boolean R() {
        return v() != null;
    }

    @Override // defpackage.wjf
    public final boolean S() {
        wja wjaVar;
        return G().isEmpty() && t() != null && (wjaVar = this.c) != null && wjaVar.G();
    }

    @Override // defpackage.wjf
    public final boolean T() {
        return f() != null && f().aA();
    }

    @Override // defpackage.wjf
    public final boolean U() {
        return f() != null && f().aB();
    }

    @Override // defpackage.wjf
    public final boolean V() {
        wja wjaVar = this.c;
        wiu wiuVarF = f();
        if (wjaVar != null) {
            return wjaVar.B();
        }
        if (wiuVarF.aV()) {
            return wiuVarF.aC();
        }
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        return alvwVar.f;
    }

    @Override // defpackage.wjf
    public final boolean W() {
        wja wjaVar = this.c;
        if (wjaVar != null) {
            return wjaVar.B() && wjaVar.H();
        }
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        return alvwVar.i;
    }

    @Override // defpackage.wjf
    public final boolean X() {
        wja wjaVar = this.c;
        return wjaVar != null && Collection.EL.stream(wjaVar.r).filter(new uvm(17)).map(new vmw(10)).distinct().count() > 1;
    }

    @Override // defpackage.wjf
    public final boolean Y() {
        wja wjaVar = this.c;
        if (wjaVar != null) {
            return wjaVar.F();
        }
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        return alvwVar.g;
    }

    @Override // defpackage.wjf
    public final boolean Z() {
        return this.o;
    }

    @Override // defpackage.wjf
    public final int a() {
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        return (int) alvwVar.e;
    }

    @Override // defpackage.wjf
    public final boolean aa() {
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        return alvwVar.h;
    }

    @Override // defpackage.wjf
    public final byte[] ab() {
        return this.a.u.G();
    }

    @Override // defpackage.wjf
    public final byte[] ac() {
        return this.a.toByteArray();
    }

    @Override // defpackage.wjf
    public final alvq[] ad() {
        return (alvq[]) this.a.t.toArray(new alvq[0]);
    }

    @Override // defpackage.wjf
    public final int ae() {
        alvw alvwVar = this.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        int iAS = a.aS(alvwVar.j);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.wjf
    public final abuz af() {
        aqmh aqmhVar;
        alvt alvtVar = this.a;
        if ((alvtVar.b & 8) != 0) {
            alvw alvwVar = alvtVar.g;
            if (alvwVar == null) {
                alvwVar = alvw.a;
            }
            aqmhVar = alvwVar.m;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
        } else {
            aqmhVar = null;
        }
        return new abuz(aqmhVar);
    }

    @Override // defpackage.wjf
    public final void ag(abuz abuzVar) {
        aihh aihhVar = (aihh) this.a.toBuilder();
        if ((((alvt) aihhVar.instance).b & 8) == 0) {
            alvw alvwVar = alvw.a;
            aihhVar.copyOnWrite();
            alvt alvtVar = (alvt) aihhVar.instance;
            alvwVar.getClass();
            alvtVar.g = alvwVar;
            alvtVar.b |= 8;
        }
        alvw alvwVar2 = this.a.g;
        if (alvwVar2 == null) {
            alvwVar2 = alvw.a;
        }
        aihf builder = alvwVar2.toBuilder();
        aqmh aqmhVarL = abuzVar.l();
        builder.copyOnWrite();
        alvw alvwVar3 = (alvw) builder.instance;
        aqmhVarL.getClass();
        alvwVar3.m = aqmhVarL;
        alvwVar3.b |= 262144;
        aihhVar.copyOnWrite();
        alvt alvtVar2 = (alvt) aihhVar.instance;
        alvw alvwVar4 = (alvw) builder.build();
        alvwVar4.getClass();
        alvtVar2.g = alvwVar4;
        alvtVar2.b |= 8;
        this.a = (alvt) aihhVar.build();
    }

    @Override // defpackage.wjf
    public final xpl ah(wjb wjbVar) {
        xpl xplVar = this.q;
        if (xplVar != null) {
            return xplVar;
        }
        xpl xplVarT = xpl.t(t(), this.b, wjbVar);
        if (xplVarT == null) {
            return null;
        }
        this.q = xplVarT;
        return xplVarT;
    }

    public final List al() {
        return this.a.m;
    }

    @Override // defpackage.wjf
    public final int b() {
        alvv alvvVar = this.a.q;
        if (alvvVar == null) {
            alvvVar = alvv.a;
        }
        return (alvvVar.b == 55735497 ? (aosn) alvvVar.c : aosn.a).c;
    }

    @Override // defpackage.wjf
    public final int c() {
        alvv alvvVar = this.a.q;
        if (alvvVar == null) {
            alvvVar = alvv.a;
        }
        return (alvvVar.b == 55735497 ? (aosn) alvvVar.c : aosn.a).d;
    }

    @Override // defpackage.wjf
    public final long d() {
        wja wjaVar = this.c;
        return wjaVar != null ? wjaVar.h : TimeUnit.SECONDS.toMillis(a());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.wjf
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wjf) {
            wjf wjfVar = (wjf) obj;
            if (Objects.equals(G(), wjfVar.G()) && Objects.equals(t(), wjfVar.t())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wjf
    public final wiu f() {
        wiu wiuVar = this.l;
        if (wiuVar == null) {
            if ((this.a.b & 2) != 0) {
                aoqd aoqdVar = this.a.e;
                if (aoqdVar == null) {
                    aoqdVar = aoqd.a;
                }
                wiuVar = new wiu(aoqdVar);
            } else {
                wiuVar = wiu.c;
            }
            this.l = wiuVar;
        }
        return wiuVar;
    }

    @Override // defpackage.wjf
    public final wja g() {
        return this.c;
    }

    @Override // defpackage.wjf
    public final wje h() {
        wje wjeVar = this.k;
        if (wjeVar == null) {
            alvm alvmVar = this.a.k;
            if (alvmVar == null) {
                alvmVar = alvm.a;
            }
            wjeVar = new wje(alvmVar);
            this.k = wjeVar;
        }
        return wjeVar;
    }

    public final int hashCode() {
        return ((G().hashCode() + 19) * 19) + (t() == null ? 0 : Arrays.hashCode(t().toByteArray()));
    }

    @Override // defpackage.wjf
    public final wjf i() {
        aitw aitwVar;
        int i;
        List listAl = al();
        if (this.d == null && listAl != null) {
            Iterator it = listAl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aitwVar = null;
                    break;
                }
                alvn alvnVar = (alvn) it.next();
                if (alvnVar != null && (i = alvnVar.b) == 88254013) {
                    if (i != 88254013) {
                        aitwVar = aitw.a;
                        break;
                    }
                    aitwVar = (aitw) alvnVar.c;
                    break;
                }
            }
            if (aitwVar != null) {
                this.d = aj((aitwVar.b == 1 ? (aigj) aitwVar.c : aigj.d).G(), this.b);
            }
        }
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, wjf] */
    @Override // defpackage.wjf
    public final wjf j(wjb wjbVar) {
        if (ah(wjbVar) != null) {
            return ah(wjbVar).b;
        }
        return null;
    }

    @Override // defpackage.wjf
    public final wjh k() {
        return this.i;
    }

    @Override // defpackage.wjf
    public final aigj l() {
        return this.a.x;
    }

    @Override // defpackage.wjf
    public final aisu m() {
        List<alvn> listAl = al();
        if (listAl != null) {
            for (alvn alvnVar : listAl) {
                aisu aisuVar = alvnVar.b == 84813246 ? (aisu) alvnVar.c : aisu.a;
                int iBi = a.bi(aisuVar.f);
                if (iBi == 0) {
                    iBi = 1;
                }
                if (iBi == 2) {
                    return aisuVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.wjf
    public final aiut n() {
        List<alvn> listAl = al();
        if (this.f == null && listAl != null) {
            for (alvn alvnVar : listAl) {
                int i = alvnVar.b;
                if (i == 97725940) {
                    this.f = i == 97725940 ? (aiut) alvnVar.c : aiut.a;
                    break;
                }
            }
        }
        return this.f;
    }

    @Override // defpackage.wjf
    public final aiux o() {
        List<alvn> listAl = al();
        if (this.g == null && listAl != null) {
            for (alvn alvnVar : listAl) {
                int i = alvnVar.b;
                if (i == 514514525) {
                    this.g = i == 514514525 ? (aiux) alvnVar.c : aiux.a;
                    break;
                }
            }
        }
        return this.g;
    }

    @Override // defpackage.wjf
    public final aivp p() {
        alvt alvtVar = this.a;
        if ((alvtVar.b & 2) == 0) {
            return null;
        }
        aoqd aoqdVar = alvtVar.e;
        if (aoqdVar == null) {
            aoqdVar = aoqd.a;
        }
        aivp aivpVar = aoqdVar.j;
        return aivpVar == null ? aivp.a : aivpVar;
    }

    @Override // defpackage.wjf
    public final aiwa q() {
        int i;
        List<alvn> listAl = al();
        if (this.h == null && listAl != null) {
            for (alvn alvnVar : listAl) {
                if (alvnVar != null && (i = alvnVar.b) == 89145698) {
                    this.h = i == 89145698 ? (aiwa) alvnVar.c : aiwa.a;
                    break;
                }
            }
        }
        return this.h;
    }

    @Override // defpackage.wjf
    public final akfp r() {
        if (f() != null) {
            return f().C();
        }
        return null;
    }

    @Override // defpackage.wjf
    public final alvf s() {
        alvt alvtVar = this.a;
        if ((alvtVar.b & 32) == 0) {
            return null;
        }
        alvf alvfVar = alvtVar.i;
        return alvfVar == null ? alvf.a : alvfVar;
    }

    @Override // defpackage.wjf
    public final alvl t() {
        alvl alvlVar = this.a.f;
        return alvlVar == null ? alvl.a : alvlVar;
    }

    @Override // defpackage.wjf
    public final alvt u() {
        return this.a;
    }

    @Override // defpackage.wjf
    public final aogq v() {
        alvt alvtVar = this.a;
        if ((alvtVar.b & SemanticState.Focused) == 0) {
            return null;
        }
        aogq aogqVar = alvtVar.l;
        return aogqVar == null ? aogq.a : aogqVar;
    }

    @Override // defpackage.wjf
    public final aopm w() {
        if (this.n == null) {
            alvb alvbVar = this.a.s;
            if (alvbVar == null) {
                alvbVar = alvb.a;
            }
            if (alvbVar.b == 59961494) {
                alvb alvbVar2 = this.a.s;
                if (alvbVar2 == null) {
                    alvbVar2 = alvb.a;
                }
                this.n = alvbVar2.b == 59961494 ? (aopm) alvbVar2.c : aopm.a;
            }
        }
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.a, parcel);
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.i, 0);
        Instant instant = this.j;
        parcel.writeLong(instant == null ? -1L : instant.toEpochMilli());
    }

    @Override // defpackage.wjf
    public final aopz x() {
        alvt alvtVar = this.a;
        if ((alvtVar.b & SemanticState.Hidden) == 0) {
            return null;
        }
        ajom ajomVar = alvtVar.o;
        if (ajomVar == null) {
            ajomVar = ajom.a;
        }
        aopz aopzVar = ajomVar.b;
        return aopzVar == null ? aopz.a : aopzVar;
    }

    @Override // defpackage.wjf
    public final Instant y() {
        return this.j;
    }

    @Override // defpackage.wjf
    public final String z() {
        alvt alvtVar = this.a;
        if ((alvtVar.b & 262144) != 0) {
            return alvtVar.w;
        }
        return null;
    }

    @Deprecated
    public wji(alvt alvtVar, long j) {
        this(alvtVar, j, wjb.a);
    }

    @Deprecated
    public wji(alvt alvtVar, long j, wja wjaVar) {
        wjh wjhVar = new wjh();
        this.e = new ArrayList();
        this.p = false;
        alvtVar.getClass();
        this.a = alvtVar;
        this.b = j;
        this.c = wjaVar;
        this.i = wjhVar;
    }

    @Deprecated
    public wji(alvt alvtVar, long j, wjb wjbVar) {
        this(alvtVar, j, ai(wjbVar, alvtVar, j));
    }

    @Deprecated
    public wji(alvt alvtVar, Instant instant, long j, wja wjaVar, wjh wjhVar, boolean z) {
        this.e = new ArrayList();
        this.p = false;
        alvtVar.getClass();
        this.a = alvtVar;
        this.j = instant;
        this.b = j;
        this.c = wjaVar;
        this.i = wjhVar;
        this.k = null;
        this.l = null;
        this.p = z;
    }
}
