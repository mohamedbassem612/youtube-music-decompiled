package defpackage;

import android.view.View;
import j$.util.OptionalInt;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vav implements avnd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vav(mgl mglVar, apxp apxpVar, View view, OptionalInt optionalInt, OptionalInt optionalInt2, OptionalInt optionalInt3, int i) {
        this.$cid = i;
        this.f = mglVar;
        this.b = apxpVar;
        this.a = view;
        this.c = optionalInt;
        this.d = optionalInt2;
        this.e = optionalInt3;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, wby] */
    @Override // defpackage.avnd
    public final void a() {
        if (this.$cid != 0) {
            asmv asmvVar = ((apxp) this.b).d;
            if (asmvVar == null) {
                asmvVar = asmv.a;
            }
            asmv asmvVar2 = asmvVar;
            Object obj = this.f;
            Object obj2 = this.e;
            Object obj3 = this.d;
            Object obj4 = this.c;
            ((acyj) ((mgl) obj).a).b(asmvVar2, (View) this.a, (OptionalInt) obj4, (OptionalInt) obj3, (OptionalInt) obj2);
            return;
        }
        Object obj5 = this.f;
        ?? r6 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        xsc.H(this.a, (String) this.b, null, (String) obj7, (String) obj6, r6, (ajwo) obj5, ajga.ASSET_ITEM_SELECTED_STATE_SELECTED);
    }

    public /* synthetic */ vav(wby wbyVar, String str, String str2, String str3, List list, ajwo ajwoVar, int i) {
        this.$cid = i;
        this.a = wbyVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = ajwoVar;
    }
}
