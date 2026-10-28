package defpackage;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xwj implements xwh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever");
    private final tft b;
    private final int c;
    private final axfd d;

    public xwj(tft tftVar, axfd axfdVar, xla xlaVar) {
        this.b = tftVar;
        this.d = axfdVar;
        this.c = Math.max(15, xlaVar.x()) + 1;
    }

    @Override // defpackage.xwh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return b((Collection) obj, 4);
    }

    public final Map b(Collection collection, int i) {
        if (collection == null || collection.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            axfd axfdVar = this.d;
            tge tgeVarB = tgf.b(String.valueOf(axfdVar.B()).concat("get_lounge_token_batch"));
            tgeVarB.d = tgd.d(Collections.singletonMap("screen_ids", TextUtils.join(",", collection)), tfs.a);
            if (((vxz) axfdVar.c).m(14, 45627566L)) {
                tgeVarB.d(tok.MDX_PAIRING_URL_BUILDER_SESSION_TOKENS);
            }
            tgf tgfVarA = tgeVarB.a();
            xwi xwiVar = new xwi(tgfVarA.a, i);
            yno.cL(this.b, tgfVarA, xwiVar);
            Map map = xwiVar.a;
            if (map != null) {
                return map;
            }
        }
        return null;
    }
}
