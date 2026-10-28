package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class fwu implements ahql {
    static final fwu a = new fwu();
    private static final ahqk b;
    private static final ahqk c;
    private static final ahqk d;
    private static final ahqk e;
    private static final ahqk f;
    private static final ahqk g;
    private static final ahqk h;
    private static final ahqk i;
    private static final ahqk j;
    private static final ahqk k;
    private static final ahqk l;
    private static final ahqk m;
    private static final ahqk n;
    private static final ahqk o;
    private static final ahqk p;

    static {
        ahqj ahqjVar = new ahqj("projectNumber");
        ahqjVar.b(new ahqn(1, ahqq.a));
        b = ahqjVar.a();
        ahqj ahqjVar2 = new ahqj("messageId");
        ahqjVar2.b(new ahqn(2, ahqq.a));
        c = ahqjVar2.a();
        ahqj ahqjVar3 = new ahqj("instanceId");
        ahqjVar3.b(new ahqn(3, ahqq.a));
        d = ahqjVar3.a();
        ahqj ahqjVar4 = new ahqj("messageType");
        ahqjVar4.b(new ahqn(4, ahqq.a));
        e = ahqjVar4.a();
        ahqj ahqjVar5 = new ahqj("sdkPlatform");
        ahqjVar5.b(new ahqn(5, ahqq.a));
        f = ahqjVar5.a();
        ahqj ahqjVar6 = new ahqj("packageName");
        ahqjVar6.b(new ahqn(6, ahqq.a));
        g = ahqjVar6.a();
        ahqj ahqjVar7 = new ahqj("collapseKey");
        ahqjVar7.b(new ahqn(7, ahqq.a));
        h = ahqjVar7.a();
        ahqj ahqjVar8 = new ahqj("priority");
        ahqjVar8.b(new ahqn(8, ahqq.a));
        i = ahqjVar8.a();
        ahqj ahqjVar9 = new ahqj("ttl");
        ahqjVar9.b(new ahqn(9, ahqq.a));
        j = ahqjVar9.a();
        ahqj ahqjVar10 = new ahqj("topic");
        ahqjVar10.b(new ahqn(10, ahqq.a));
        k = ahqjVar10.a();
        ahqj ahqjVar11 = new ahqj("bulkId");
        ahqjVar11.b(new ahqn(11, ahqq.a));
        l = ahqjVar11.a();
        ahqj ahqjVar12 = new ahqj("event");
        ahqjVar12.b(new ahqn(12, ahqq.a));
        m = ahqjVar12.a();
        ahqj ahqjVar13 = new ahqj("analyticsLabel");
        ahqjVar13.b(new ahqn(13, ahqq.a));
        n = ahqjVar13.a();
        ahqj ahqjVar14 = new ahqj("campaignId");
        ahqjVar14.b(new ahqn(14, ahqq.a));
        o = ahqjVar14.a();
        ahqj ahqjVar15 = new ahqj("composerLabel");
        ahqjVar15.b(new ahqn(15, ahqq.a));
        p = ahqjVar15.a();
    }

    @Override // defpackage.ahqh
    public final /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        ahua ahuaVar = (ahua) obj;
        ahqs ahqsVar = (ahqs) obj2;
        ahqsVar.b(b, ahuaVar.a, true);
        ahqsVar.c(c, ahuaVar.b, true);
        ahqsVar.c(d, ahuaVar.c, true);
        ahqsVar.c(e, ahuaVar.d, true);
        ahqsVar.c(f, ahuaVar.e, true);
        ahqsVar.c(g, ahuaVar.f, true);
        ahqsVar.c(h, ahuaVar.g, true);
        ahqsVar.a(i, ahuaVar.h, true);
        ahqsVar.a(j, ahuaVar.i, true);
        ahqsVar.c(k, ahuaVar.j, true);
        ahqsVar.b(l, 0L, true);
        ahqsVar.c(m, ahuaVar.k, true);
        ahqsVar.c(n, ahuaVar.l, true);
        ahqsVar.b(o, 0L, true);
        ahqsVar.c(p, ahuaVar.m, true);
    }
}
