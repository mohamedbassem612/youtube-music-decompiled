package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.facebook.litho.ComponentTree;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addi implements nrw {
    public final aunn a;
    public Handler b;
    private final Context c;
    private final aunn d;
    private final ahto e;

    public addi(Context context, aunn aunnVar, ahto ahtoVar, aunn aunnVar2) {
        this.c = context;
        this.d = aunnVar;
        this.e = ahtoVar;
        this.a = aunnVar2;
    }

    public static final avlb f(aknp aknpVar, nrv nrvVar, aunn aunnVar) {
        nry nryVar = (nry) aunnVar.io();
        CommandOuterClass$Command defaultInstance = aknpVar.e;
        if (defaultInstance == null) {
            defaultInstance = CommandOuterClass$Command.getDefaultInstance();
        }
        return nryVar.a(defaultInstance, nrvVar);
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return aknp.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    @Override // defpackage.nrw
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        aknp aknpVar = (aknp) obj;
        if (aknpVar.d.isEmpty() && (aknpVar.c & 2) == 0) {
            return avlb.e();
        }
        if (aknpVar.d.isEmpty()) {
            return f(aknpVar, nrvVar, this.a);
        }
        if ((aknpVar.c & 2) == 0) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return avlb.n(new mgd(this, aknpVar, nrvVar, 17, (short[]) null)).v(avmh.a());
            }
            d(aknpVar, nrvVar);
            return avlb.e();
        }
        View viewB = nrvVar.b();
        if (viewB == null) {
            return avlb.e();
        }
        viewB.setOnTouchListener(new addg(this, aknpVar, nrvVar));
        addh addhVar = new addh(this, Looper.getMainLooper(), aknpVar, nrvVar);
        this.b = addhVar;
        addhVar.sendEmptyMessageDelayed(1, 200L);
        return avlb.e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void d(aknp aknpVar, nrv nrvVar) {
        final akno aknoVar;
        asmv asmvVar;
        fjw fjwVar;
        xgt xgtVarA;
        final View viewB = nrvVar.b();
        if (viewB != null) {
            xgn xgnVar = (xgn) aecm.z(nrvVar).f();
            if (xgnVar == null || (xgtVarA = xgnVar.a()) == null) {
                aknoVar = null;
            } else {
                argn argnVar = argn.a;
                aihf aihfVarCreateBuilder = argnVar.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
                argnVar2.b |= 2;
                argnVar2.d = xgtVarA.f;
                aihfVarCreateBuilder.copyOnWrite();
                argn argnVar3 = (argn) aihfVarCreateBuilder.instance;
                argnVar3.b |= 8;
                argnVar3.f = 0;
                argn argnVar4 = (argn) aihfVarCreateBuilder.build();
                aihf aihfVarCreateBuilder2 = akno.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                akno aknoVar2 = (akno) aihfVarCreateBuilder2.instance;
                argnVar4.getClass();
                aknoVar2.c = argnVar4;
                aknoVar2.b |= 1;
                aihf aihfVarCreateBuilder3 = argnVar.createBuilder();
                aigj aigjVar = aknpVar.f;
                aihfVarCreateBuilder3.copyOnWrite();
                argn argnVar5 = (argn) aihfVarCreateBuilder3.instance;
                aigjVar.getClass();
                argnVar5.b |= 1;
                argnVar5.c = aigjVar;
                argn argnVar6 = (argn) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder2.copyOnWrite();
                akno aknoVar3 = (akno) aihfVarCreateBuilder2.instance;
                argnVar6.getClass();
                aknoVar3.d = argnVar6;
                aknoVar3.b |= 2;
                aknoVar = (akno) aihfVarCreateBuilder2.build();
            }
            avmm avmmVar = new avmm();
            if ((aknpVar.c & 8) != 0) {
                asmvVar = aknpVar.g;
                if (asmvVar == null) {
                    asmvVar = asmv.a;
                }
            } else {
                asmvVar = null;
            }
            if (asmvVar == null) {
                fjwVar = null;
            } else {
                Context context = this.c;
                fjwVar = new fjw(context);
                fhd fhdVar = fjwVar.y;
                mlo mloVar = (mlo) this.d.io();
                nsk nskVarB = nsl.b();
                nskVarB.b(fjwVar);
                nskVarB.p(false);
                fhm fhmVarC = ComponentTree.c(fhdVar, mloVar.a(fhdVar, nskVarB.a(), asmvVar.toByteArray(), null, avmmVar), null);
                fhmVarC.d = false;
                fjwVar.K(fhmVarC.a(), true);
                fjwVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(((Integer) twm.p(context).first).intValue()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(((Integer) twm.p(context).second).intValue()), Integer.MIN_VALUE));
                fjwVar.layout(0, 0, fjwVar.getMeasuredWidth() - 1, fjwVar.getMeasuredHeight() - 1);
            }
            final ahto ahtoVar = this.e;
            String str = aknpVar.d;
            Uri uri = Uri.parse(str);
            final avgj avgjVar = new avgj(avmmVar, null);
            if (TextUtils.isEmpty(str) || uri == null) {
                return;
            }
            ClipData clipDataNewRawUri = ClipData.newRawUri(str, uri);
            int i = true != ((vxz) ahtoVar.b).l(32, 45831152L, true) ? 257 : SemanticState.Hidden;
            if (aknoVar != null) {
                viewB.setOnDragListener(new View.OnDragListener() { // from class: aeac
                    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
                    @Override // android.view.View.OnDragListener
                    public final boolean onDrag(View view, DragEvent dragEvent) {
                        if (view != viewB) {
                            return false;
                        }
                        akno aknoVar4 = aknoVar;
                        ahto ahtoVar2 = ahtoVar;
                        int action = dragEvent.getAction();
                        if (action == 4) {
                            ?? r1 = ahtoVar2.c;
                            if (r1 != 0) {
                                qpj.f(r1);
                            }
                            ((avmm) avgjVar.a).dispose();
                            if (dragEvent.getResult()) {
                                ahtoVar2.e(aknoVar4, 4);
                            } else {
                                ahtoVar2.e(aknoVar4, 5);
                            }
                        } else if (action == 6) {
                            ahtoVar2.e(aknoVar4, 3);
                        }
                        return true;
                    }
                });
            }
            View.DragShadowBuilder dragShadowBuilder = fjwVar != null ? new View.DragShadowBuilder(fjwVar) : new View.DragShadowBuilder(viewB);
            int i2 = bac.a;
            boolean zC = azu.c(viewB, clipDataNewRawUri, dragShadowBuilder, null, i);
            if (fjwVar != null) {
                ahtoVar.c = new aead(viewB, dragShadowBuilder, 0);
                qpj.e(ahtoVar.c);
            }
            if (zC) {
                ahtoVar.e(aknoVar, 2);
            }
        }
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }
}
