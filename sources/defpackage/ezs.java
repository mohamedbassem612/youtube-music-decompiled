package defpackage;

import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezs implements eua {
    private final eua a;
    private final Resources b;

    public ezs(Resources resources, eua euaVar) {
        if (resources == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.b = resources;
        this.a = euaVar;
    }

    @Override // defpackage.eua
    public final ewf a(Object obj, int i, int i2, ety etyVar) {
        ewf ewfVarA = this.a.a(obj, i, i2, etyVar);
        if (ewfVarA == null) {
            return null;
        }
        return new fbd(this.b, ewfVarA);
    }

    @Override // defpackage.eua
    public final boolean b(Object obj, ety etyVar) {
        return this.a.b(obj, etyVar);
    }
}
