package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class atxy {
    public static volatile avbh a;

    private atxy() {
    }

    public static atzk a(String str, String str2, atzc atzcVar, atzb atzbVar) {
        try {
            return new atzd((HttpURLConnection) new URL(str).openConnection(), str2, atzcVar, atzbVar);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }

    public static int b(int i) {
        if (i != 2) {
            return i != 3 ? 5 : 4;
        }
        return 3;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "LINE_TYPE_UNSPECIFIED";
            case 2:
                return "LINE_TYPE_CENTER_HORIZONTAL";
            case 3:
                return "LINE_TYPE_CENTER_VERTICAL";
            case 4:
                return "LINE_TYPE_BORDER_TOP";
            case 5:
                return "LINE_TYPE_BORDER_BOTTOM";
            case 6:
                return "LINE_TYPE_BORDER_LEFT";
            case 7:
                return "LINE_TYPE_BORDER_RIGHT";
            default:
                return "LINE_TYPE_ROTATIONAL";
        }
    }

    public static int d(int i) {
        if (i == 2) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int e(int i) {
        if (i == 0) {
            return 13;
        }
        switch (i) {
            case 101:
                return 1;
            case 102:
                return 2;
            case 103:
                return 3;
            case 104:
                return 4;
            case 105:
                return 5;
            case 106:
                return 6;
            case 107:
                return 7;
            case 108:
                return 8;
            case 109:
                return 9;
            case 110:
                return 10;
            case 111:
                return 11;
            case 112:
                return 12;
            default:
                return 0;
        }
    }

    public static /* synthetic */ aufs f(aihh aihhVar) {
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        return (aufs) aihnVarBuild;
    }

    public static /* synthetic */ aikl g(jrr jrrVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((augy) jrrVar.instance).u);
        listUnmodifiableList.getClass();
        return new aikl(listUnmodifiableList);
    }

    public static /* synthetic */ augy h(jrr jrrVar) {
        aihn aihnVarBuild = jrrVar.build();
        aihnVarBuild.getClass();
        return (augy) aihnVarBuild;
    }

    public static void i(aigu aiguVar, jrr jrrVar) {
        jrrVar.copyOnWrite();
        augy augyVar = (augy) jrrVar.instance;
        augy augyVar2 = augy.a;
        augyVar.j = aiguVar;
        augyVar.b |= 32;
    }

    public static void j(aigu aiguVar, jrr jrrVar) {
        jrrVar.copyOnWrite();
        augy augyVar = (augy) jrrVar.instance;
        augy augyVar2 = augy.a;
        augyVar.i = aiguVar;
        augyVar.b |= 16;
    }

    public static void k(auhb auhbVar, jrr jrrVar) {
        jrrVar.copyOnWrite();
        augy augyVar = (augy) jrrVar.instance;
        augy augyVar2 = augy.a;
        augyVar.d = auhbVar;
        augyVar.c = 110;
    }

    public static /* synthetic */ void l(jrr jrrVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((augy) jrrVar.instance).t);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static auyr o(auyr auyrVar, List list) {
        auyrVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            auyrVar = new auyv(auyrVar, (auyu) it.next());
        }
        return auyrVar;
    }

    public static auyr p(auyr auyrVar, auyu... auyuVarArr) {
        return o(auyrVar, Arrays.asList(auyuVarArr));
    }

    public Status m(avbr avbrVar) {
        throw null;
    }

    public auyw n() {
        throw null;
    }

    public void q(Status status, avbe avbeVar) {
        throw null;
    }

    public void s(Object obj) {
        throw null;
    }

    public atxy(char[] cArr) {
    }

    public void t() {
    }

    public void r(avbe avbeVar) {
    }
}
