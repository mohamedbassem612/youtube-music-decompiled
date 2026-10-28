package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class pyn {
    public static final /* synthetic */ int a = 0;
    private static final List b = atqq.aL(new aidr[]{aidr.RECEIVE, aidr.DISPLAY});

    public static final boolean a(aiec aiecVar) {
        aidr aidrVar;
        aiecVar.getClass();
        List list = b;
        aids aidsVar = aiecVar.y;
        if (aidsVar == null) {
            aidsVar = aids.a;
        }
        int i = aidsVar.b;
        if (i == 0) {
            aidrVar = aidr.DROP_LOCATION_UNSPECIFIED;
        } else if (i != 1) {
            aidrVar = i != 2 ? null : aidr.RECEIVE;
        } else {
            aidrVar = aidr.DISPLAY;
        }
        if (aidrVar == null) {
            aidrVar = aidr.UNRECOGNIZED;
        }
        return list.contains(aidrVar);
    }
}
