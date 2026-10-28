package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfw implements rtb {
    private final aunn a;

    public gfw(aunn aunnVar) {
        this.a = aunnVar;
    }

    @Override // defpackage.rtb
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            vor vorVar = (vor) this.a.io();
            str.getClass();
            vorVar.v(new hsb(str, 1), true);
        }
    }

    @Override // defpackage.rtb
    public final void b(List list, amco amcoVar) {
        amdd amddVar;
        if (amcoVar != null) {
            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar2 = (amdd) aihfVarCreateBuilder.instance;
            amddVar2.q = amcoVar;
            amddVar2.c |= SemanticState.ReadOnly;
            amddVar = (amdd) aihfVarCreateBuilder.build();
        } else {
            amddVar = null;
        }
        amdd amddVar3 = amddVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            akuf akufVar = (akuf) it.next();
            vor vorVar = (vor) this.a.io();
            akuj akujVar = akufVar.b == 138681066 ? (akuj) akufVar.c : akuj.b;
            boolean z = false;
            if ((akujVar.c & 4194304) != 0 && akujVar.B) {
                z = true;
            }
            vorVar.x(akujVar, amddVar3, z, null, false, null);
        }
    }

    @Override // defpackage.rtb
    public final boolean d() {
        return ((vor) this.a.io()).I();
    }

    @Override // defpackage.rtb
    public final /* synthetic */ void c(rta rtaVar) {
    }
}
