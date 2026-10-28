package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mep {
    public final int a;
    public final meu b;
    private final Class c;

    public mep(int i, Class cls, meu meuVar) {
        this.a = i;
        this.c = cls;
        this.b = meuVar;
    }

    public abstract long a();

    public final met b(met metVar) {
        return (met) this.c.cast(metVar);
    }

    public abstract met c(UpbMessage upbMessage);

    public abstract UpbMiniTable d();
}
