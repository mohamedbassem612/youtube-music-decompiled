package defpackage;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahvu extends agtx {
    private final agke a;

    public ahvu(String str, agke agkeVar) {
        super(str);
        this.a = agkeVar;
    }

    @Override // defpackage.agsw
    public final void c(agsu agsuVar) {
        int i = 0;
        while (true) {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                return;
            }
            agsw agswVar = (agsw) agkeVar.get(i);
            if (agsuVar.J() || agswVar.d(agsuVar.q())) {
                agswVar.c(agsuVar);
            }
            i++;
        }
    }

    @Override // defpackage.agsw
    public final boolean d(Level level) {
        int i = 0;
        while (true) {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                return false;
            }
            if (((agsw) agkeVar.get(i)).d(level)) {
                return true;
            }
            i++;
        }
    }
}
