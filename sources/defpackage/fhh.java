package defpackage;

import android.widget.TextView;
import com.facebook.litho.TextContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fhh implements TextContent {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public fhh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // com.facebook.litho.TextContent
    public final List getTextItems() {
        if (this.$cid == 0) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((TextView) this.a).getText());
        return arrayList;
    }
}
