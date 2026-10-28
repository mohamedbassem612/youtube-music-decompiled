package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Set;
import java.util.Timer;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agbl extends InstanceProxy {
    public final adxr a;
    public final asiu b;

    public agbl(adxr adxrVar, asiu asiuVar) {
        this.a = adxrVar;
        this.b = asiuVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* synthetic */ mew a() {
        return this.b;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '646200271'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '646200271'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -489221090 || i == -639656544 || i == 731856425 || i == 765280538 || i == 860258342;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        adtv adtvVar;
        aifz aifzVarA;
        aciz acizVar;
        asif asifVar;
        boolean z = true;
        if (i != -489221090) {
            if (i == -639656544) {
                return this.a.h().toByteArray();
            }
            if (i == 731856425) {
                return this.a.b((ashu) aihn.parseFrom(ashu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
            }
            if (i == 765280538) {
                return this.a.c((asij) aihn.parseFrom(asij.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
            }
            if (i != 860258342) {
                throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '646200271'."));
            }
            adxr adxrVar = this.a;
            synchronized (adxrVar) {
                adtvVar = !adxrVar.g() ? adxrVar.b : null;
            }
            if (adtvVar != null) {
                taq.d();
                HashMap map = adtvVar.am;
                if (map.size() != 1 || (acizVar = (aciz) map.remove(map.keySet().iterator().next())) == null) {
                    z = false;
                } else {
                    ((Timer) acizVar.a).cancel();
                    afwl.i(new acnp(adtvVar, acizVar, 17, null)).run();
                }
                aifzVarA = aifz.a(z);
            } else {
                aifzVarA = aifz.a(false);
            }
            return aifzVarA.toByteArray();
        }
        asie asieVar = (asie) aihn.parseFrom(asie.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        final adxr adxrVar2 = this.a;
        synchronized (adxrVar2) {
            if (adxrVar2.g()) {
                asifVar = asif.a;
            } else {
                final adtv adtvVar2 = adxrVar2.b;
                final adxz adxzVar = adxrVar2.c;
                if ((asieVar.b & 1) != 0) {
                    apoi apoiVar = asieVar.c;
                    if (apoiVar == null) {
                        apoiVar = apoi.a;
                    }
                    final acjx acjxVarAe = aawb.ae(apoiVar);
                    if (acjxVarAe == null) {
                        asifVar = asif.a;
                    } else {
                        agbe agbeVar = (agbe) adxrVar2.a.b(new agbi(agbf.a, 1), new Function() { // from class: adxq
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public final /* synthetic */ Function mo840andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                adtv adtvVar3 = adtvVar2;
                                adtvVar3.getClass();
                                adxz adxzVar2 = adxzVar;
                                adxzVar2.getClass();
                                acjx acjxVar = acjxVarAe;
                                adxr adxrVar3 = adxrVar2;
                                boolean z2 = adxrVar3.e;
                                Set set = adxrVar3.d;
                                adxp adxpVarA = adxrVar3.a(adtvVar3, acjxVar, adxzVar2, z2);
                                set.add(adxpVarA);
                                return adxpVarA;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        aihf aihfVarCreateBuilder = asif.a.createBuilder();
                        aihf aihfVarCreateBuilder2 = asil.a.createBuilder();
                        String strH = agbeVar.h();
                        aihfVarCreateBuilder2.copyOnWrite();
                        asil asilVar = (asil) aihfVarCreateBuilder2.instance;
                        strH.getClass();
                        asilVar.b |= 1;
                        asilVar.c = strH;
                        asil asilVar2 = (asil) aihfVarCreateBuilder2.build();
                        aihfVarCreateBuilder.copyOnWrite();
                        asif asifVar2 = (asif) aihfVarCreateBuilder.instance;
                        asilVar2.getClass();
                        asifVar2.c = asilVar2;
                        asifVar2.b |= 1;
                        asifVar = (asif) aihfVarCreateBuilder.build();
                    }
                } else {
                    asifVar = asif.a;
                }
            }
        }
        return asifVar.toByteArray();
    }
}
