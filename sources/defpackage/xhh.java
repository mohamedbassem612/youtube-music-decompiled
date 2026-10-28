package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class xhh extends vxj {
    private final vxe a;
    private final String d;
    private final aihh e;

    public xhh(vxe vxeVar, ajwo ajwoVar, boolean z, String str) {
        super(vxeVar, null, ajwoVar, z);
        this.a = vxeVar;
        this.e = ajwoVar != null ? (aihh) ajwoVar.toBuilder() : null;
        this.d = str;
    }

    @Override // defpackage.vxj, android.text.style.ClickableSpan
    public final void onClick(View view) {
        aihh aihhVar = this.e;
        if (aihhVar != null) {
            String str = this.d;
            if (str != null) {
                aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                aoarVar.b |= 1;
                aoarVar.c = str;
                aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
            }
            this.a.c((ajwo) aihhVar.build(), null);
        }
    }
}
