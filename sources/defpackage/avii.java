package defpackage;

import io.grpc.Status;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avii extends avat {
    public static final avan f = avan.d("pick_first: attempting to connect");
    public final aval g;
    public avaq h;
    public auzd i = auzd.d;

    public avii(aval avalVar) {
        this.g = avalVar;
    }

    @Override // defpackage.avat
    public final Status a(avap avapVar) {
        avig avigVar;
        Boolean bool;
        List listD = avapVar.a;
        if (listD.isEmpty()) {
            auyo auyoVar = avapVar.b;
            Status statusWithDescription = Status.m.withDescription("NameResolver returned no usable address. addrs=" + String.valueOf(listD) + ", attrs=" + auyoVar.toString());
            b(statusWithDescription);
            return statusWithDescription;
        }
        Object obj = avapVar.c;
        if ((obj instanceof avig) && (bool = (avigVar = (avig) obj).a) != null && bool.booleanValue()) {
            Long l = avigVar.b;
            listD = avie.d(listD, new Random());
        }
        avaq avaqVar = this.h;
        if (avaqVar == null) {
            aval avalVar = this.g;
            avag avagVar = new avag();
            avagVar.c(listD);
            avaq avaqVarB = avalVar.b(avagVar.a());
            avaqVarB.c(new avif(this, avaqVarB, 0));
            this.h = avaqVarB;
            e(auzd.a, new avak(f));
            avaqVarB.a();
        } else {
            avaqVar.d(listD);
        }
        return Status.OK;
    }

    @Override // defpackage.avat
    public final void b(Status status) {
        avaq avaqVar = this.h;
        if (avaqVar != null) {
            avaqVar.b();
            this.h = null;
        }
        e(auzd.c, new avak(avan.b(status)));
    }

    @Override // defpackage.avat
    public final void c() {
        avaq avaqVar = this.h;
        if (avaqVar != null) {
            avaqVar.b();
            this.h = null;
        }
    }

    public final void d() {
        avaq avaqVar = this.h;
        if (avaqVar != null) {
            avaqVar.a();
        }
    }

    public final void e(auzd auzdVar, avar avarVar) {
        this.i = auzdVar;
        this.g.f(auzdVar, avarVar);
    }
}
