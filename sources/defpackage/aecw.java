package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aecw extends pt {
    private final aecq a;
    private final List b;
    private int c;
    private Consumer d;

    public aecw(aecq aecqVar, boolean z) {
        super(true != z ? 3 : 15);
        this.c = -1;
        this.a = aecqVar;
        this.b = new ArrayList();
    }

    @Override // defpackage.pp
    public final void d(RecyclerView recyclerView, oh ohVar) {
        super.d(recyclerView, ohVar);
        int iA = ohVar.a();
        adkz adkzVarD = this.a.D();
        int i = this.c;
        if (i != -1 && i != iA) {
            agke agkeVarN = agke.n(this.b);
            int size = agkeVarN.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((aecv) agkeVarN.get(i2)).a();
            }
            Consumer consumer = this.d;
            if (consumer != null) {
                aihh aihhVar = (aihh) asmq.a.createBuilder();
                int i3 = this.c;
                aihhVar.copyOnWrite();
                asmq asmqVar = (asmq) aihhVar.instance;
                asmqVar.c |= 2;
                asmqVar.e = i3;
                aihhVar.copyOnWrite();
                asmq asmqVar2 = (asmq) aihhVar.instance;
                asmqVar2.c |= 4;
                asmqVar2.f = iA;
                Object objD = adkzVarD.d(iA);
                if (objD instanceof acxm) {
                    akrn akrnVar = ((acxm) objD).a;
                    akro akroVar = akrnVar.c;
                    if (akroVar == null) {
                        akroVar = akro.a;
                    }
                    if ((akroVar.b & 33554432) != 0) {
                        akro akroVar2 = akrnVar.c;
                        if (akroVar2 == null) {
                            akroVar2 = akro.a;
                        }
                        akyk akykVar = akroVar2.k;
                        if (akykVar == null) {
                            akykVar = akyk.a;
                        }
                        String str = akykVar.c;
                        aihhVar.copyOnWrite();
                        asmq asmqVar3 = (asmq) aihhVar.instance;
                        str.getClass();
                        asmqVar3.c |= 1;
                        asmqVar3.d = str;
                    }
                }
                if (iA > 0 && iA <= adkzVarD.a()) {
                    Object objD2 = adkzVarD.d(iA - 1);
                    if (objD2 instanceof acxm) {
                        akrn akrnVar2 = ((acxm) objD2).a;
                        akro akroVar3 = akrnVar2.c;
                        if (akroVar3 == null) {
                            akroVar3 = akro.a;
                        }
                        if ((akroVar3.b & 33554432) != 0) {
                            aihl aihlVar = akyc.b;
                            aihf aihfVarCreateBuilder = akyc.a.createBuilder();
                            akro akroVar4 = akrnVar2.c;
                            if (akroVar4 == null) {
                                akroVar4 = akro.a;
                            }
                            akyk akykVar2 = akroVar4.k;
                            if (akykVar2 == null) {
                                akykVar2 = akyk.a;
                            }
                            aihfVarCreateBuilder.copyOnWrite();
                            akyc akycVar = (akyc) aihfVarCreateBuilder.instance;
                            akykVar2.getClass();
                            akycVar.d = akykVar2;
                            akycVar.c |= 1;
                            aihhVar.e(aihlVar, (akyc) aihfVarCreateBuilder.build());
                        }
                    }
                }
                consumer.r((asmq) aihhVar.build());
            }
        }
        this.c = -1;
        this.d = null;
    }

    @Override // defpackage.pp
    public final boolean h(RecyclerView recyclerView, oh ohVar, oh ohVar2) {
        int iA = ohVar.a();
        int iA2 = ohVar2.a();
        if (this.c == -1) {
            this.c = iA;
            View view = ohVar.a;
            Object tag = view.getTag(R.id.elements_item_drag_started_sender_state_consumer);
            if (a$$ExternalSyntheticApiModelOutline0.m$1(tag)) {
                Consumer consumerM7m = a$$ExternalSyntheticApiModelOutline0.m7m(tag);
                aihh aihhVar = (aihh) asmq.a.createBuilder();
                aihhVar.copyOnWrite();
                asmq asmqVar = (asmq) aihhVar.instance;
                asmqVar.c |= 2;
                asmqVar.e = iA;
                aihhVar.copyOnWrite();
                asmq asmqVar2 = (asmq) aihhVar.instance;
                asmqVar2.c |= 4;
                asmqVar2.f = iA2;
                consumerM7m.r((asmq) aihhVar.build());
            }
            Object tag2 = view.getTag(R.id.elements_item_dropped_sender_state_consumer);
            if (a$$ExternalSyntheticApiModelOutline0.m$1(tag2)) {
                this.d = a$$ExternalSyntheticApiModelOutline0.m7m(tag2);
            }
        }
        return this.a.aR(iA, iA2);
    }

    @Override // defpackage.pp
    public final void l() {
    }

    @Override // defpackage.pp
    public final void o(oh ohVar) {
    }
}
