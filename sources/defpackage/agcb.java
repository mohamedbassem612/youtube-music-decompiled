package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class agcb extends InstanceProxy {
    public final agca a;

    public agcb(agca agcaVar) {
        this.a = agcaVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '506050093'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '506050093'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 2091871005 || i == 731353766 || i == 1913510699 || i == 26968014 || i == -539476858 || i == -799181294 || i == -293272641 || i == -130767984 || i == 1630746472 || i == -156164186 || i == -144244264 || i == -1275089337;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        boolean zIsEmpty;
        asmv asmvVar;
        int i2 = 2;
        if (i == 2091871005) {
            aspc aspcVar = (aspc) aihn.parseFrom(aspc.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agca agcaVar = this.a;
            int i3 = aspcVar.b;
            if (i3 == 1) {
                agcaVar.d((asph) aspcVar.c, Integer.valueOf(aspcVar.d));
            } else if (i3 == 3) {
                agcaVar.c(aguu.u(((aspg) aspcVar.c).b, new kke(i2)), Integer.valueOf(aspcVar.d));
            }
            return aigv.a.toByteArray();
        }
        if (i == 731353766) {
            aspd aspdVar = (aspd) aihn.parseFrom(aspd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agca agcaVar2 = this.a;
            int i4 = aspdVar.b;
            if (i4 == 1) {
                agcaVar2.d((asph) aspdVar.c, null);
            } else if (i4 == 3) {
                agcaVar2.c(aguu.u(((aspg) aspdVar.c).b, new kke(i2)), null);
            }
            return aigv.a.toByteArray();
        }
        if (i == 1913510699) {
            aspn aspnVar = (aspn) aihn.parseFrom(aspn.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agca agcaVar3 = this.a;
            int i5 = aspnVar.c;
            int i6 = (aspnVar.b & 2) != 0 ? aspnVar.d : 1;
            ahno.G(i6 > 0, "size has to be a positive integer.");
            synchronized (agcaVar3) {
                int i7 = i5 + i6;
                List list = agcaVar3.c;
                ahno.N(i5, i7, list.size());
                for (int i8 = 0; i8 < i6; i8++) {
                    agcaVar3.b.remove((String) list.remove(i5));
                }
            }
            return aigv.a.toByteArray();
        }
        if (i == 26968014) {
            aspm aspmVar = (aspm) aihn.parseFrom(aspm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agca agcaVar4 = this.a;
            int i9 = aspmVar.b;
            int i10 = aspmVar.c;
            synchronized (agcaVar4) {
                List list2 = agcaVar4.c;
                ahno.W(i9, list2.size());
                ahno.W(i10, list2.size());
                list2.add(i10, (String) list2.remove(i9));
            }
            return aigv.a.toByteArray();
        }
        if (i == -539476858) {
            return this.a.e().toByteArray();
        }
        if (i == -799181294) {
            return this.a.g().toByteArray();
        }
        if (i == -293272641) {
            return this.a.f().toByteArray();
        }
        if (i == -130767984) {
            try {
                asmvVar = (asmv) aihn.parseFrom(asmv.a, this.a.a((aspi) aihn.parseFrom(aspi.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())), ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik unused) {
                asmvVar = asmv.a;
            }
            return asmvVar.toByteArray();
        }
        if (i == 1630746472) {
            aspi aspiVar = (aspi) aihn.parseFrom(aspi.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agca agcaVar5 = this.a;
            aihf aihfVarCreateBuilder = aspj.a.createBuilder();
            aigj aigjVarA = agcaVar5.a(aspiVar);
            aihfVarCreateBuilder.copyOnWrite();
            aspj aspjVar = (aspj) aihfVarCreateBuilder.instance;
            aigjVarA.getClass();
            aspjVar.b |= 1;
            aspjVar.c = aigjVarA;
            return ((aspj) aihfVarCreateBuilder.build()).toByteArray();
        }
        if (i == -156164186) {
            return this.a.b((aigv) aihn.parseFrom(aigv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i != -144244264) {
            if (i != -1275089337) {
                throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '506050093'."));
            }
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            aigv aigvVar = aigv.a;
            agcc agccVar = (agcc) this.a.a.getAndSet(null);
            if (agccVar != null) {
                agccVar.close();
            }
            return aigvVar.toByteArray();
        }
        aspo aspoVar = (aspo) aihn.parseFrom(aspo.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agca agcaVar6 = this.a;
        afzb afzbVar = new afzb(9);
        aspf aspfVar = aspoVar.b;
        if (aspfVar == null) {
            aspfVar = aspf.a;
        }
        agcaVar6.a.set((agcc) agcaVar6.d.c(afzbVar, aspfVar));
        synchronized (agcaVar6) {
            zIsEmpty = agcaVar6.c.isEmpty();
        }
        return (!zIsEmpty ? agcaVar6.b(aigv.a) : aigv.a).toByteArray();
    }
}
