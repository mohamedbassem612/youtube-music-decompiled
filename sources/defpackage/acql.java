package defpackage;

import android.speech.tts.TextToSpeech;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acql implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ acql(long j, avlh avlhVar, adif adifVar, int i) {
        this.$cid = i;
        this.a = j;
        this.c = avlhVar;
        this.b = adifVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$cid;
        if (i == 0) {
            abng abngVarC = ((acqz) this.b).aa.c((ajwo) this.c, this.a);
            if (abngVarC != null) {
                return abngVarC.a;
            }
            throw new IllegalStateException("Failed to parse the inline player response");
        }
        byte[] bArr = null;
        if (i == 1) {
            agrf agrfVar = tsr.a;
            ((TextToSpeech) this.b).playSilentUtterance(this.a, 1, (String) this.c);
            return null;
        }
        int i2 = 4;
        if (i == 2) {
            awrl awrlVar = new awrl();
            long j = this.a;
            awrlVar.a = j;
            return ((avlh) this.c).p().W(new acpr(new acjo(this.b, awrlVar, i2, bArr), 11)).U(Long.valueOf(j)).Y(new acpq(new actf(3), 5));
        }
        aerl aerlVar = (aerl) this.b;
        mbc mbcVar = aerlVar.a;
        long millis = mbcVar.e().toMillis();
        aero aeroVar = aerlVar.b;
        Thread thread = (Thread) aeroVar.b;
        StackTraceElement[] stackTrace = thread.getStackTrace();
        aihf aihfVarCreateBuilder = akcb.a.createBuilder();
        String name = thread.getName();
        aihfVarCreateBuilder.copyOnWrite();
        akcb akcbVar = (akcb) aihfVarCreateBuilder.instance;
        name.getClass();
        akcbVar.b |= 2;
        akcbVar.d = name;
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String string = stackTraceElement.toString();
            if (sb.length() + string.length() > 2000) {
                break;
            }
            sb.append(string);
            sb.append('\n');
        }
        long j2 = this.a;
        Object obj = this.c;
        String string2 = sb.toString();
        aihfVarCreateBuilder.copyOnWrite();
        akcb akcbVar2 = (akcb) aihfVarCreateBuilder.instance;
        akcbVar2.b |= 1;
        akcbVar2.c = string2;
        aihf aihfVarCreateBuilder2 = akby.a.createBuilder();
        aihf aihfVarCreateBuilder3 = akca.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        akca akcaVar = (akca) aihfVarCreateBuilder3.instance;
        akcb akcbVar3 = (akcb) aihfVarCreateBuilder.build();
        akcbVar3.getClass();
        akcaVar.c = akcbVar3;
        akcaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        akby akbyVar = (akby) aihfVarCreateBuilder2.instance;
        akca akcaVar2 = (akca) aihfVarCreateBuilder3.build();
        akcaVar2.getClass();
        akbyVar.a();
        akbyVar.c.add(akcaVar2);
        int i3 = aeroVar.a;
        aihfVarCreateBuilder2.copyOnWrite();
        akby akbyVar2 = (akby) aihfVarCreateBuilder2.instance;
        akbyVar2.b |= 1;
        akbyVar2.d = i3;
        long millis2 = mbcVar.e().toMillis() - millis;
        aihf aihfVarCreateBuilder4 = aqic.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        aqic aqicVar = (aqic) aihfVarCreateBuilder4.instance;
        aqicVar.b |= 1;
        aern aernVar = (aern) obj;
        aqicVar.c = aernVar.c;
        aihfVarCreateBuilder4.copyOnWrite();
        aqic aqicVar2 = (aqic) aihfVarCreateBuilder4.instance;
        aqicVar2.b |= 2;
        aqicVar2.d = aernVar.b;
        aihfVarCreateBuilder4.copyOnWrite();
        aqic aqicVar3 = (aqic) aihfVarCreateBuilder4.instance;
        aqicVar3.b |= 4;
        aqicVar3.e = millis - j2;
        aihfVarCreateBuilder4.copyOnWrite();
        aqic aqicVar4 = (aqic) aihfVarCreateBuilder4.instance;
        akby akbyVar3 = (akby) aihfVarCreateBuilder2.build();
        akbyVar3.getClass();
        aqicVar4.g = akbyVar3;
        aqicVar4.b |= 16;
        long jConvert = TimeUnit.MICROSECONDS.convert(millis2, TimeUnit.MILLISECONDS);
        aihfVarCreateBuilder4.copyOnWrite();
        aqic aqicVar5 = (aqic) aihfVarCreateBuilder4.instance;
        aqicVar5.b |= 8;
        aqicVar5.f = jConvert;
        return (aqic) aihfVarCreateBuilder4.build();
    }

    public /* synthetic */ acql(TextToSpeech textToSpeech, long j, String str, int i) {
        this.$cid = i;
        this.b = textToSpeech;
        this.a = j;
        this.c = str;
    }

    public /* synthetic */ acql(Object obj, Object obj2, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
