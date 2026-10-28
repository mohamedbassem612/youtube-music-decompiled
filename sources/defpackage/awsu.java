package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awsu implements awsx {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Object b;

    public awsu(awsx awsxVar, awqg awqgVar, int i) {
        this.$cid = i;
        this.a = awsxVar;
        this.b = awqgVar;
    }

    @Override // defpackage.awsx
    public final Iterator a() {
        int i = this.$cid;
        if (i == 0) {
            return new awst(this);
        }
        if (i != 1) {
            return i != 2 ? new awte(this) : new awtc(this);
        }
        return new awsp(this);
    }

    public awsu(CharSequence charSequence, awqk awqkVar, int i) {
        this.$cid = i;
        this.b = charSequence;
        this.a = awqkVar;
    }
}
