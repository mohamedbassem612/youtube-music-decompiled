package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import io.grpc.Status;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mjl extends foe {
    public static final /* synthetic */ int z = 0;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nro m;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    int n;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    myz o;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nry p;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    avmm q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nso s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nth t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    ntr u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuc v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nue w;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean x;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean y;

    public mjl() {
        super("DataDrivenCollectionSection");
    }

    @Override // defpackage.foe
    protected final /* synthetic */ fky b() {
        return new mjk();
    }

    @Override // defpackage.foe
    public final /* bridge */ /* synthetic */ foe c(boolean z2) {
        mjl mjlVar = (mjl) super.c(z2);
        if (!z2) {
            mjlVar.g = new mjk();
        }
        return mjlVar;
    }

    @Override // defpackage.foe
    /* JADX INFO: renamed from: f */
    public final boolean a(foe foeVar) {
        myz myzVar;
        nry nryVar;
        avmm avmmVar;
        nsl nslVar;
        nso nsoVar;
        nth nthVar;
        ntr ntrVar;
        nuc nucVar;
        nue nueVar;
        if (this == foeVar) {
            return true;
        }
        if (foeVar != null && getClass() == foeVar.getClass()) {
            mjl mjlVar = (mjl) foeVar;
            nro nroVar = this.m;
            if (nroVar == null ? mjlVar.m == null : nroVar.equals(mjlVar.m)) {
                if (this.n == mjlVar.n && ((myzVar = this.o) == null ? mjlVar.o == null : myzVar.equals(mjlVar.o)) && ((nryVar = this.p) == null ? mjlVar.p == null : nryVar.equals(mjlVar.p)) && ((avmmVar = this.q) == null ? mjlVar.q == null : avmmVar.equals(mjlVar.q)) && ((nslVar = this.r) == null ? mjlVar.r == null : nslVar.equals(mjlVar.r)) && ((nsoVar = this.s) == null ? mjlVar.s == null : nsoVar.equals(mjlVar.s)) && ((nthVar = this.t) == null ? mjlVar.t == null : nthVar.equals(mjlVar.t)) && ((ntrVar = this.u) == null ? mjlVar.u == null : ntrVar.equals(mjlVar.u)) && ((nucVar = this.v) == null ? mjlVar.v == null : nucVar.equals(mjlVar.v)) && ((nueVar = this.w) == null ? mjlVar.w == null : nueVar.equals(mjlVar.w)) && this.x == mjlVar.x && this.y == mjlVar.y) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.foh
    protected final Object g(fip fipVar, Object obj) {
        byte[] bArrT = null;
        switch (fipVar.c) {
            case 851046848:
                isw iswVar = (isw) obj;
                fiu fiuVar = fipVar.b;
                Object[] objArr = fipVar.d;
                return Boolean.valueOf(!((Boolean) objArr[1]).booleanValue());
            case 947264300:
                isw iswVar2 = (isw) obj;
                fiu fiuVar2 = fipVar.b;
                return Boolean.valueOf(((String) iswVar2.a).equals((String) iswVar2.b));
            case 1380951079:
                fiu fiuVar3 = fipVar.b;
                mjk mjkVar = (mjk) this.g;
                AtomicBoolean atomicBoolean = mjkVar.e;
                AtomicBoolean atomicBoolean2 = mjkVar.f;
                AtomicReference atomicReference = mjkVar.g;
                atomicBoolean.set(false);
                if (!atomicBoolean2.compareAndSet(true, false)) {
                    return null;
                }
                foh.l((fof) atomicReference.get(), 3);
                return null;
            case 1463818325:
                zh zhVar = (zh) obj;
                fiu fiuVar4 = fipVar.b;
                final fof fofVar = (fof) fipVar.d[0];
                final int i = zhVar.a;
                final String str = (String) zhVar.b;
                mjl mjlVar = (mjl) fiuVar4;
                fky fkyVar = this.g;
                final nsl nslVar = mjlVar.r;
                final nuc nucVar = mjlVar.v;
                final ntr ntrVar = mjlVar.u;
                final nth nthVar = mjlVar.t;
                final avmm avmmVar = mjlVar.q;
                final nro nroVar = mjlVar.m;
                final boolean z2 = mjlVar.x;
                final nso nsoVar = mjlVar.s;
                final boolean z3 = mjlVar.y;
                final Map map = ((mjk) fkyVar).c;
                if (!z2 && (bArrT = ket.T(nroVar, str, nslVar, nucVar)) == null) {
                    return fqe.r();
                }
                if (map == null) {
                    nucVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, "DDC failed to fetch element disposable map.", new Object[0]);
                    return fqe.r();
                }
                nyf nyfVarAE = nyh.aE(fofVar);
                final byte[] bArr = bArrT;
                nyfVarAE.d(new nxw() { // from class: mjm
                    @Override // defpackage.nxw
                    public final fgy a(fhd fhdVar, nsl nslVar2) {
                        avmm avmmVar2;
                        String str2 = str;
                        nsl nslVar3 = nslVar;
                        boolean z4 = z2;
                        nuc nucVar2 = nucVar;
                        avmm avmmVar3 = avmmVar;
                        int i2 = i;
                        fof fofVar2 = fofVar;
                        byte[] bArrT2 = z4 ? ket.T(nroVar, str2, nslVar3, nucVar2) : bArr;
                        if (bArrT2 == null) {
                            return fqp.aE(fhdVar).a;
                        }
                        Map map2 = map;
                        synchronized (map2) {
                            if (!map2.containsKey(str2)) {
                                map2.put(str2, new avmm());
                            }
                            avmmVar2 = (avmm) map2.get(str2);
                            avmmVar3.c(avmmVar2);
                        }
                        nth nthVar2 = nthVar;
                        ntr ntrVar2 = ntrVar;
                        nso nsoVar2 = nsoVar;
                        if (!z3) {
                            try {
                                return ntrVar2.a(fhdVar, nslVar2, nsoVar2.a(bArrT2, false), nthVar2, avmmVar2);
                            } catch (IOException unused) {
                                nucVar2.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar3, "DDC failed to parse element bytes.", new Object[0]);
                                return fqp.aE(fhdVar).a;
                            }
                        }
                        try {
                            asmv asmvVar = (asmv) aihn.parseFrom(asmv.a, bArrT2, ExtensionRegistryLite.getGeneratedRegistry());
                            asod asodVar = asmvVar.d;
                            if (asodVar == null) {
                                asodVar = asod.a;
                            }
                            String str3 = nslVar3.u + ':' + i2;
                            aihh aihhVar = (aihh) asodVar.toBuilder();
                            aihl aihlVar = asri.b;
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                            asodVar.c(aihlVarCheckIsLite);
                            Object objK = asodVar.j.k(aihlVarCheckIsLite.d);
                            aihf builder = ((asri) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).toBuilder();
                            builder.copyOnWrite();
                            asri asriVar = (asri) builder.instance;
                            asriVar.c |= 2;
                            asriVar.d = str3;
                            aihhVar.e(aihlVar, (asri) builder.build());
                            asod asodVar2 = (asod) aihhVar.build();
                            aihh aihhVar2 = (aihh) asmvVar.toBuilder();
                            aihhVar2.copyOnWrite();
                            asmv asmvVar2 = (asmv) aihhVar2.instance;
                            asodVar2.getClass();
                            asmvVar2.d = asodVar2;
                            asmvVar2.b |= 2;
                            nay nayVarA = nsoVar2.a(((asmv) aihhVar2.build()).toByteArray(), true);
                            fgy fgyVarA = ntrVar2.a(fhdVar, nslVar2, nayVarA, nthVar2, avmmVar2);
                            npg npgVar = new npg(str3, null);
                            asrl asrlVarC = npi.c(nayVarA, null, null, null, nsoVar2);
                            if (asrlVarC != null) {
                                npgVar.c(asrlVarC);
                            }
                            fmc fmcVarAE = fmd.aE(fofVar2);
                            fmcVarAE.c(fgyVarA);
                            fmcVarAE.N(npgVar);
                            return fmcVarAE.a();
                        } catch (IOException unused2) {
                            nucVar2.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar3, "DDC failed to parse element bytes.", new Object[0]);
                            return fqp.aE(fhdVar).a;
                        }
                    }
                });
                nyfVarAE.e(nslVar);
                if (nroVar.g) {
                    nyfVarAE.c(Boolean.TRUE);
                    nyfVarAE.a.d = new mqd(map, str);
                }
                fqc fqcVar = new fqc();
                fqcVar.b = nyfVarAE.a();
                return new fqe(fqcVar);
            default:
                return null;
        }
    }

    @Override // defpackage.foh
    protected final void i(fof fofVar) {
        fky fkyVar = this.g;
        nro nroVar = this.m;
        nue nueVar = this.w;
        nsl nslVar = this.r;
        avmm avmmVar = this.q;
        nuc nucVar = this.v;
        nry nryVar = this.p;
        int i = this.n;
        Boolean bool = Boolean.FALSE;
        agke agkeVarN = agke.n(nroVar.identifiers());
        HashMap map = new HashMap();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        AtomicReference atomicReference = new AtomicReference(fofVar);
        AtomicReference atomicReference2 = new AtomicReference(nroVar);
        AtomicInteger atomicInteger = new AtomicInteger(i);
        ket.S(nroVar, atomicReference, nslVar, nucVar, avmmVar, atomicBoolean, atomicBoolean2);
        if (nueVar != null) {
            nueVar.N(new qcb(atomicReference, null));
        }
        if (agkeVarN.isEmpty() && nroVar.b >= 0) {
            atomicBoolean.set(true);
            CommandOuterClass$Command commandOuterClass$CommandA = nroVar.a();
            if (commandOuterClass$CommandA != null) {
                ket.R(nryVar, nslVar, avmmVar, commandOuterClass$CommandA);
            } else {
                nroVar.loadMore();
            }
        }
        mjk mjkVar = (mjk) fkyVar;
        mjkVar.h = bool;
        mjkVar.d = agkeVarN;
        mjkVar.c = map;
        mjkVar.e = atomicBoolean;
        mjkVar.f = atomicBoolean2;
        mjkVar.g = atomicReference;
        mjkVar.b = atomicReference2;
        mjkVar.a = atomicInteger;
    }

    @Override // defpackage.foh
    protected final void j(fky fkyVar, fky fkyVar2) {
        mjk mjkVar = (mjk) fkyVar;
        mjk mjkVar2 = (mjk) fkyVar2;
        mjkVar2.a = mjkVar.a;
        mjkVar2.b = mjkVar.b;
        mjkVar2.c = mjkVar.c;
        mjkVar2.d = mjkVar.d;
        mjkVar2.e = mjkVar.e;
        mjkVar2.f = mjkVar.f;
        mjkVar2.g = mjkVar.g;
        mjkVar2.h = mjkVar.h;
    }

    @Override // defpackage.foh
    protected final void p() {
        fky fkyVar = this.g;
        nsl nslVar = this.r;
        avmm avmmVar = this.q;
        nuc nucVar = this.v;
        nro nroVar = this.m;
        nry nryVar = this.p;
        if (((mjk) fkyVar).f.compareAndSet(false, true)) {
            omj omjVar = nroVar.m;
            CommandOuterClass$Command commandOuterClass$CommandX = omjVar != null ? omjVar.x() : null;
            if (commandOuterClass$CommandX != null) {
                ket.R(nryVar, nslVar, avmmVar, commandOuterClass$CommandX);
                return;
            }
            Status statusReload = nroVar.reload();
            if (statusReload.e()) {
                return;
            }
            nucVar.f(aslh.LOG_TYPE_CONFIGURATION_ERROR, nslVar, statusReload.asException(), "Error reloading data driven collection (pull to refresh).", new Object[0]);
        }
    }

    @Override // defpackage.foh
    protected final void q(int i, int i2) {
        fky fkyVar = this.g;
        nsl nslVar = this.r;
        avmm avmmVar = this.q;
        nro nroVar = this.m;
        nry nryVar = this.p;
        AtomicBoolean atomicBoolean = ((mjk) fkyVar).e;
        int i3 = nroVar.b;
        if (i3 < 0 || (i2 - i) - 1 > i3 || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        CommandOuterClass$Command commandOuterClass$CommandA = nroVar.a();
        if (commandOuterClass$CommandA != null) {
            ket.R(nryVar, nslVar, avmmVar, commandOuterClass$CommandA);
        } else {
            nroVar.loadMore();
        }
    }

    @Override // defpackage.foh
    protected final dov s(fof fofVar) {
        boolean z2;
        fky fkyVar = this.g;
        nro nroVar = this.m;
        nsl nslVar = this.r;
        avmm avmmVar = this.q;
        nuc nucVar = this.v;
        int i = this.n;
        mjk mjkVar = (mjk) fkyVar;
        Boolean bool = mjkVar.h;
        agke agkeVar = mjkVar.d;
        AtomicReference atomicReference = mjkVar.g;
        AtomicReference atomicReference2 = mjkVar.b;
        AtomicBoolean atomicBoolean = mjkVar.e;
        AtomicBoolean atomicBoolean2 = mjkVar.f;
        AtomicInteger atomicInteger = mjkVar.a;
        atomicReference.set(fofVar);
        if (((nro) atomicReference2.getAndSet(nroVar)) != nroVar) {
            ket.S(nroVar, atomicReference, nslVar, nucVar, avmmVar, atomicBoolean, atomicBoolean2);
        }
        if (i > atomicInteger.get()) {
            atomicInteger.set(i);
            z2 = true;
        } else {
            z2 = false;
        }
        ci ciVar = new ci((short[]) null);
        fos fosVar = new fos(fofVar, new fot());
        fot fotVar = fosVar.b;
        fotVar.n = bool;
        fosVar.a.l = "DDC-DataDiffSection-" + atomicInteger.get();
        if (nroVar.k) {
            agkeVar = agpi.a;
        }
        fotVar.m = agkeVar;
        fosVar.c.set(0);
        fotVar.r = m(mjl.class, fofVar, 1380951079, new Object[]{fofVar});
        fotVar.q = m(mjl.class, fofVar, 1463818325, new Object[]{fofVar});
        fotVar.p = m(mjl.class, fofVar, 947264300, new Object[]{fofVar});
        fotVar.o = m(mjl.class, fofVar, 851046848, new Object[]{fofVar, Boolean.valueOf(z2)});
        ciVar.F(fosVar);
        return (dov) ciVar.a;
    }
}
