package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wqu extends wlu {
    public boolean a;
    public boolean b;
    public boolean c;
    public alsg d;
    private final Set e;

    public wqu(abxv abxvVar, zwa zwaVar, Set set, boolean z) {
        super(true != z ? "live_chat/get_live_chat" : "live_chat/get_live_interactivity", abxvVar, zwaVar, 1, true, null, null);
        this.e = set;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alsh.a.createBuilder();
        if (!TextUtils.isEmpty(this.i)) {
            String str = this.i;
            aihfVarCreateBuilder.copyOnWrite();
            alsh alshVar = (alsh) aihfVarCreateBuilder.instance;
            str.getClass();
            alshVar.b |= 8;
            alshVar.e = str;
        }
        if (this.a) {
            aihfVarCreateBuilder.copyOnWrite();
            alsh alshVar2 = (alsh) aihfVarCreateBuilder.instance;
            alshVar2.b |= SemanticState.Focused;
            alshVar2.g = true;
        }
        if (this.b) {
            aihfVarCreateBuilder.copyOnWrite();
            alsh alshVar3 = (alsh) aihfVarCreateBuilder.instance;
            alshVar3.b |= 131072;
            alshVar3.h = true;
        }
        if (this.c) {
            aihfVarCreateBuilder.copyOnWrite();
            alsh alshVar4 = (alsh) aihfVarCreateBuilder.instance;
            alshVar4.b |= 32;
            alshVar4.f = true;
        }
        alsg alsgVar = this.d;
        if (alsgVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alsh alshVar5 = (alsh) aihfVarCreateBuilder.instance;
            alshVar5.d = alsgVar;
            alshVar5.b |= 4;
        }
        Set set = this.e;
        if (set != null && !set.isEmpty()) {
            agqr it = ((agpr) set).iterator();
            while (it.hasNext()) {
                wqt wqtVar = (wqt) it.next();
                if (wqtVar != null) {
                    wqtVar.a();
                }
            }
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
