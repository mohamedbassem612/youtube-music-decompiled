package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aohq implements weh {
    static final aohp a;
    public static final weq b;
    private final aohr c;

    static {
        aohp aohpVar = new aohp();
        a = aohpVar;
        b = aohpVar;
    }

    public aohq(aohr aohrVar) {
        this.c = aohrVar;
    }

    public static aoho e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = aohr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aohr aohrVar = (aohr) aihfVarCreateBuilder.instance;
        aohrVar.b |= 1;
        aohrVar.c = str;
        return new aoho(aihfVarCreateBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        agqs agqsVarListIterator = ((agke) getStreamsProgressModels()).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            agkxVar.j(new agkx().g());
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
    public final boolean equals(Object obj) {
        return (obj instanceof aohq) && this.c.equals(((aohq) obj).c);
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aoho d() {
        return new aoho(this.c.toBuilder());
    }

    public List getStreamsProgress() {
        return this.c.d;
    }

    public List getStreamsProgressModels() {
        agjz agjzVar = new agjz(4);
        Iterator it = this.c.d.iterator();
        while (it.hasNext()) {
            agjzVar.h(new aqdo((aqdp) ((aqdp) it.next()).toBuilder().build()));
        }
        return agjzVar.g();
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "OfflineVideoStreamsEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
