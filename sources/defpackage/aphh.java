package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aphh implements weh {
    static final aphg a;
    public static final weq b;
    private final aphi c;

    static {
        aphg aphgVar = new aphg();
        a = aphgVar;
        b = aphgVar;
    }

    public aphh(aphi aphiVar) {
        this.c = aphiVar;
    }

    public static aphf e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = aphi.b.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aphi aphiVar = (aphi) aihfVarCreateBuilder.instance;
        aphiVar.c |= 1;
        aphiVar.d = str;
        return new aphf(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new aphf(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aphh) && this.c.equals(((aphh) obj).c);
    }

    public List getConstraints() {
        return new aihx(this.c.f, aphi.a);
    }

    public Long getRefreshTime() {
        return Long.valueOf(this.c.e);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "RefreshEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
