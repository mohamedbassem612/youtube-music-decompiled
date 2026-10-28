package defpackage;

import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class sbk implements scg {
    public final vwt g = new vwt((byte[]) null, (char[]) null, (byte[]) null);

    @Override // defpackage.scg
    public final void A(snk snkVar) {
        this.g.Z(snkVar.b());
    }

    protected abstract agkz ac();

    @Override // defpackage.scg
    public final void z(int i, snk snkVar, smr smrVar, sko skoVar) throws sau {
        vwt vwtVar = this.g;
        if (vwtVar.ac(snkVar.b())) {
            throw new sau("Tried to register duplicate trigger: " + String.valueOf(snkVar) + " for slot: " + smrVar.a, 12);
        }
        aa(snkVar, smrVar, skoVar);
        if (!Collection.EL.stream(ac()).noneMatch(new jmy(snkVar, 20))) {
            vwtVar.ab(snkVar.b(), new sni(i, snkVar, smrVar, skoVar));
            Z(snkVar, smrVar);
            return;
        }
        throw new sau("Incorrect TriggerType: Tried to register trigger for slot: " + smrVar.a + " of type " + snkVar.a().name() + " in " + getClass().getSimpleName(), 4);
    }

    protected void Z(snk snkVar, smr smrVar) {
    }

    protected void aa(snk snkVar, smr smrVar, sko skoVar) {
    }
}
