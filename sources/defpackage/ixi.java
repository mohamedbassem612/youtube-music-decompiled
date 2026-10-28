package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixi {
    public boolean e = false;
    public List c = new ArrayList();
    public final awkx b = new awkx();
    public final awkx a = new awkx();
    public ajsx d = ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
    private final Set f = new HashSet();

    private final void k(List list, List list2) {
        agke agkeVarN = agke.n(list2);
        agke agkeVarN2 = agke.n(list);
        if (agkeVarN != null && agkeVarN2 != null) {
            this.b.kk(new ixh(agkeVarN, agkeVarN2));
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((ixg) it.next()).a(j());
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (agkeVarN == null) {
            sb.append(" oldChips");
        }
        if (agkeVarN2 == null) {
            sb.append(" newChips");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final int a() {
        for (int i = 0; i < this.c.size(); i++) {
            if (((ajsy) this.c.get(i)).k) {
                return i;
            }
        }
        return -1;
    }

    public final agke b() {
        return agke.n(this.c);
    }

    public final Optional c() {
        if (!j()) {
            return Optional.empty();
        }
        ajsy ajsyVar = (ajsy) this.c.get(a());
        i(ajsyVar);
        return Optional.of(ajsyVar);
    }

    public final void d(ixg ixgVar) {
        this.f.add(ixgVar);
    }

    public final void e() {
        this.b.kn();
        this.a.kn();
        this.f.clear();
    }

    public final void f() {
        this.e = true;
    }

    public final void g() {
        if (this.e) {
            this.a.kk(Boolean.FALSE);
        }
    }

    public final void h(List list) {
        if (this.c.equals(list)) {
            return;
        }
        agke agkeVarB = b();
        this.c.clear();
        this.c.addAll(list);
        k(list, agkeVarB);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    public final void i(ajsy ajsyVar) {
        if (ajsyVar == null || ajsyVar.p) {
            return;
        }
        axix axixVar = new axix(null);
        agke agkeVarN = agke.n(this.c);
        ArrayList arrayList = new ArrayList();
        for (ajsy ajsyVar2 : this.c) {
            boolean zEquals = ajsyVar2.equals(ajsyVar);
            if (zEquals) {
                axixVar.a = true;
            }
            int iOrdinal = this.d.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5 && zEquals) {
                            ajsyVar2 = null;
                        } else if (!gzj.I(ajsyVar2)) {
                            aihf builder = ajsyVar2.toBuilder();
                            boolean z = (zEquals || ajsyVar2.k) ? false : true;
                            builder.copyOnWrite();
                            ajsy ajsyVar3 = (ajsy) builder.instance;
                            ajsyVar3.b |= SemanticState.Focused;
                            ajsyVar3.k = z;
                            ajsyVar2 = (ajsy) builder.build();
                        }
                    } else if (axixVar.a) {
                        if (!gzj.I(ajsyVar2)) {
                            aihf builder2 = ajsyVar2.toBuilder();
                            if (zEquals) {
                            }
                            builder2.copyOnWrite();
                            ajsy ajsyVar4 = (ajsy) builder2.instance;
                            ajsyVar4.b |= SemanticState.Focused;
                            ajsyVar4.k = z;
                            ajsyVar2 = (ajsy) builder2.build();
                        }
                    }
                } else if (zEquals) {
                    if (!gzj.I(ajsyVar2)) {
                        aihf builder3 = ajsyVar2.toBuilder();
                        if (zEquals) {
                        }
                        builder3.copyOnWrite();
                        ajsy ajsyVar5 = (ajsy) builder3.instance;
                        ajsyVar5.b |= SemanticState.Focused;
                        ajsyVar5.k = z;
                        ajsyVar2 = (ajsy) builder3.build();
                    }
                }
            } else if (!zEquals || !ajsyVar2.k) {
                if (!gzj.I(ajsyVar2)) {
                    aihf builder4 = ajsyVar2.toBuilder();
                    if (zEquals) {
                    }
                    builder4.copyOnWrite();
                    ajsy ajsyVar6 = (ajsy) builder4.instance;
                    ajsyVar6.b |= SemanticState.Focused;
                    ajsyVar6.k = z;
                    ajsyVar2 = (ajsy) builder4.build();
                }
            }
            if (ajsyVar2 != null) {
                arrayList.add(ajsyVar2);
            }
        }
        this.c = arrayList;
        k(agke.n(arrayList), agkeVarN);
    }

    public final boolean j() {
        return a() != -1;
    }
}
