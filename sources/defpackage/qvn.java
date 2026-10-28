package defpackage;

import android.util.Log;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.research.xeno.effect.Effect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvn extends qvk implements qyw {
    public final String b;
    private final qvm h;

    public qvn(qvn qvnVar) {
        super(qvnVar);
        this.b = qvnVar.b;
        this.h = qvnVar.h;
    }

    @Override // defpackage.qvk, defpackage.qvc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvc clone() {
        return new qvn(this);
    }

    @Override // defpackage.qvk, defpackage.qvc
    public final /* synthetic */ Object clone() {
        return new qvn(this);
    }

    @Override // defpackage.qvk
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ qvk a() {
        return new qvn(this);
    }

    @Override // defpackage.qyw
    public final agkz k() {
        return new agqj("output_events");
    }

    @Override // defpackage.atur
    public final /* bridge */ /* synthetic */ void l(Packet packet, String str, Object obj) {
        attf attfVar;
        if (str.equals("output_events")) {
            try {
                attfVar = (attf) PacketGetter.b(packet, attf.a);
            } catch (aiik e) {
                Log.e("SavedXenoEffect", "An unexpected Error occurred while loading the SavedXenoEffect", e);
                attfVar = null;
            }
            if (attfVar != null) {
                for (int i = 0; i < attfVar.b.size(); i++) {
                    aifv aifvVar = (aifv) attfVar.b.get(i);
                    if (aifvVar.b.equals("type.googleapis.com/xeno.effect.LoadStateResponseEventProto")) {
                        try {
                        } catch (aiik e2) {
                            Log.e("SavedXenoEffect", "An unexpected Error occurred while loading the SavedXenoEffect", e2);
                        }
                    }
                }
            }
        }
    }

    public qvn(Effect effect, String str, qvm qvmVar) {
        super(effect);
        this.b = str;
        this.h = qvmVar;
    }
}
