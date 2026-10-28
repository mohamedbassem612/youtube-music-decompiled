package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evm {
    public final fco a;
    public final axr b;
    private final Class c;
    private final List d;
    private final String e;

    public evm(Class cls, Class cls2, Class cls3, List list, fco fcoVar, axr axrVar) {
        this.c = cls;
        this.d = list;
        this.a = fcoVar;
        this.b = axrVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + '}';
    }

    public final ewf a(euj eujVar, int i, int i2, ety etyVar, List list) throws ewb {
        List list2 = this.d;
        int size = list2.size();
        ewf ewfVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            eua euaVar = (eua) list2.get(i3);
            try {
                if (euaVar.b(eujVar.a(), etyVar)) {
                    ewfVarA = euaVar.a(eujVar.a(), i, i2, etyVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (ewfVarA != null) {
                break;
            }
        }
        if (ewfVarA != null) {
            return ewfVarA;
        }
        throw new ewb(this.e, new ArrayList(list));
    }

    public final String toString() {
        fco fcoVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + fcoVar.toString() + '}';
    }
}
