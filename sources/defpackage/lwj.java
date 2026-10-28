package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwj extends lxq implements lyq {
    public lwj() {
        super(lwk.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        s();
        lwk lwkVar = (lwk) this.a;
        int i = lwk.SCHEMA_TYPE_FIELD_NUMBER;
        lye lyeVar = lwkVar.paths_;
        if (!lyeVar.c()) {
            lwkVar.paths_ = lxt.A(lyeVar);
        }
        lwm.l(iterable, lwkVar.paths_);
    }

    public final void d(String str) {
        s();
        lwk lwkVar = (lwk) this.a;
        int i = lwk.SCHEMA_TYPE_FIELD_NUMBER;
        str.getClass();
        lwkVar.bitField0_ |= 1;
        lwkVar.schemaType_ = str;
    }

    @Override // defpackage.lxq, defpackage.lvr
    public final String g() {
        return ((lwk) this.a).schemaType_;
    }
}
