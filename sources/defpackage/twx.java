package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class twx extends tww {
    public final Object b;
    public final twx c;
    private final float d;
    private List e;

    public twx(int i, Object obj, twx twxVar) {
        super(i);
        this.b = obj;
        this.c = twxVar;
        float fD = d(twxVar);
        this.d = i != 1 ? fD + 1.0f : fD;
    }

    public static float d(twx twxVar) {
        if (twxVar != null) {
            return twxVar.d;
        }
        return 0.0f;
    }

    @Override // defpackage.tww
    public final int b() {
        return 1;
    }

    @Override // defpackage.twy
    public final List e() {
        List list = this.e;
        if (list != null) {
            return list;
        }
        List listSingletonList = Collections.singletonList(this.b);
        this.e = listSingletonList;
        return listSingletonList;
    }
}
