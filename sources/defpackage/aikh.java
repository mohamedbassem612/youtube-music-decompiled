package defpackage;

import j$.util.Objects;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aikh implements aiki {
    public static final aikh a = new aikh(Collections.EMPTY_MAP, false);
    public static final aikh b = new aikh(Collections.EMPTY_MAP, true);
    public final Map c;
    public final boolean d;

    public aikh(Map map, boolean z) {
        this.c = map;
        this.d = z;
    }

    public static aikh b(affc affcVar) {
        aikg aikgVar = new aikg();
        boolean z = affcVar.d;
        if (!aikgVar.c) {
            throw new IllegalStateException("setInverted cannot be called on a builder that has fields.");
        }
        aikgVar.b = z;
        for (Integer num : affcVar.c) {
            num.intValue();
            aikgVar.a.put(num, b);
        }
        for (affb affbVar : affcVar.b) {
            Map map = aikgVar.a;
            Integer numValueOf = Integer.valueOf(affbVar.c);
            affc affcVar2 = affbVar.d;
            if (affcVar2 == null) {
                affcVar2 = affc.a;
            }
            map.put(numValueOf, b(affcVar2));
        }
        return aikgVar.b();
    }

    public final affc a() {
        aihf aihfVarCreateBuilder = affc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((affc) aihfVarCreateBuilder.instance).d = this.d;
        Map map = this.c;
        for (Integer num : map.keySet()) {
            int iIntValue = num.intValue();
            aikh aikhVar = (aikh) map.get(num);
            if (aikhVar.equals(b)) {
                aihfVarCreateBuilder.copyOnWrite();
                affc affcVar = (affc) aihfVarCreateBuilder.instance;
                aihv aihvVar = affcVar.c;
                if (!aihvVar.c()) {
                    affcVar.c = aihn.mutableCopy(aihvVar);
                }
                affcVar.c.h(iIntValue);
            } else {
                aihf aihfVarCreateBuilder2 = affb.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                ((affb) aihfVarCreateBuilder2.instance).c = iIntValue;
                affc affcVarA = aikhVar.a();
                aihfVarCreateBuilder2.copyOnWrite();
                affb affbVar = (affb) aihfVarCreateBuilder2.instance;
                affcVarA.getClass();
                affbVar.d = affcVarA;
                affbVar.b |= 1;
                affb affbVar2 = (affb) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                affc affcVar2 = (affc) aihfVarCreateBuilder.instance;
                affbVar2.getClass();
                aiie aiieVar = affcVar2.b;
                if (!aiieVar.c()) {
                    affcVar2.b = aihn.mutableCopy(aiieVar);
                }
                affcVar2.b.add(affbVar2);
            }
        }
        return (affc) aihfVarCreateBuilder.build();
    }

    public final aikh c(int i) {
        aikh aikhVar = (aikh) this.c.get(Integer.valueOf(i));
        if (aikhVar == null) {
            aikhVar = a;
        }
        return this.d ? aikhVar.d() : aikhVar;
    }

    public final aikh d() {
        Map map = this.c;
        boolean zIsEmpty = map.isEmpty();
        boolean z = this.d;
        if (zIsEmpty) {
            return z ? a : b;
        }
        return new aikh(map, !z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                aikh aikhVar = (aikh) obj;
                if (Objects.equals(this.c, aikhVar.c) && this.d == aikhVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.c, Boolean.valueOf(this.d));
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        if (equals(a)) {
            ageuVarAc.a("empty()");
        } else if (equals(b)) {
            ageuVarAc.a("all()");
        } else {
            ageuVarAc.b("fields", this.c);
            ageuVarAc.g("inverted", this.d);
        }
        return ageuVarAc.toString();
    }
}
