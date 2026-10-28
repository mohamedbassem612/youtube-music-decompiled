package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class beb {
    public bdv a;
    private final bgl b;
    private final awou c;
    private List d;

    public beb(bgl bglVar, awou awouVar) {
        awouVar.getClass();
        this.b = bglVar;
        this.c = awouVar;
        this.a = new bgq();
        this.d = awno.a;
    }

    public final bec a() {
        bdv bdvVar = this.a;
        List list = this.d;
        list.getClass();
        List listSingletonList = Collections.singletonList(new bhg(list, (awoq) null, 1));
        listSingletonList.getClass();
        return new bfp(this.b, listSingletonList, bdvVar, this.c);
    }

    public final void b(List list) {
        this.d = atqq.aj(this.d, list);
    }
}
