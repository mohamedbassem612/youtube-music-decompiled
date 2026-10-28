package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anun implements weh {
    static final anum a;
    public static final weq b;
    private final anuw c;

    static {
        anum anumVar = new anum();
        a = anumVar;
        b = anumVar;
    }

    public anun(anuw anuwVar) {
        this.c = anuwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anuw anuwVar = this.c;
        if ((anuwVar.b & 2) != 0) {
            agkxVar.c(anuwVar.d);
        }
        agqs agqsVarListIterator = ((agke) getEntriesModels()).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            anuo anuoVar = (anuo) agqsVarListIterator.next();
            agkx agkxVar2 = new agkx();
            anuv anuvVar = anuoVar.a;
            if ((anuvVar.b & 2) != 0) {
                agkxVar2.c(anuvVar.c);
            }
            agkxVar.j(agkxVar2.g());
        }
        return agkxVar.g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new anul(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anun) && this.c.equals(((anun) obj).c);
    }

    public String getContinuationToken() {
        return this.c.f;
    }

    public List getEntries() {
        return this.c.e;
    }

    public List getEntriesModels() {
        agjz agjzVar = new agjz(4);
        Iterator it = this.c.e.iterator();
        while (it.hasNext()) {
            agjzVar.h(new anuo((anuv) ((anuv) it.next()).toBuilder().build()));
        }
        return agjzVar.g();
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicPlaylistEntryCollectionEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
