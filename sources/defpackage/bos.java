package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class bos implements boe {
    private final Object a;
    private final bnr b;

    public bos(Object obj) {
        this.a = obj;
        this.b = bnt.a.b(obj.getClass());
    }

    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        Map map = this.b.a;
        List list = (List) map.get(boaVar);
        Object obj = this.a;
        bnr.a(list, bogVar, boaVar, obj);
        bnr.a((List) map.get(boa.ON_ANY), bogVar, boaVar, obj);
    }
}
