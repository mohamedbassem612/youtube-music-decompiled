package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aatw implements aaug {
    private static final int[] e = {R.attr.backgroundSecondaryInverse, R.attr.colorPrimaryAlternate, R.attr.selectableItemBackground, R.attr.textAppearanceBody1, R.attr.textAppearanceButton, R.attr.textAppearanceTitle, R.attr.textAppearanceSubhead};
    protected final Activity a;
    protected final vxe b;
    protected final adhv c;
    protected aatv d;
    private final aduv f;
    private aatu g;
    private aazo h;

    public aatw(Activity activity, aduv aduvVar, vxe vxeVar, adhv adhvVar) {
        activity.getClass();
        this.a = activity;
        aduvVar.getClass();
        this.f = aduvVar;
        vxeVar.getClass();
        this.b = vxeVar;
        adhvVar.getClass();
        this.c = adhvVar;
        int[] iArr = e;
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(iArr);
        for (int i = 0; i < 7; i++) {
            if (typedArrayObtainStyledAttributes.getResourceId(i, -1) == -1) {
                throw new IllegalStateException("Resource attribute required but not provided ".concat(String.valueOf(activity.getResources().getResourceEntryName(iArr[i]))));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    protected void a() {
        this.d = new aatv(this.a, c(), this.b, this.c);
    }

    @Override // defpackage.aaug
    public void b(Object obj, xgn xgnVar, Pair pair) {
        d(obj, xgnVar, pair);
    }

    protected final AlertDialog.Builder c() {
        return new AlertDialog.Builder(this.a);
    }

    public final void d(Object obj, xgn xgnVar, Pair pair) {
        alay alayVar;
        alay alayVar2;
        ajnf ajnfVar;
        ajnf ajnfVar2;
        alay alayVar3;
        alay alayVar4;
        int iA = 0;
        if (obj instanceof arat) {
            arat aratVar = (arat) obj;
            if (aratVar.k) {
                if (this.d == null) {
                    a();
                }
                aatv aatvVar = this.d;
                aatvVar.getClass();
                aatvVar.l = LayoutInflater.from(aatvVar.h).inflate(aatvVar.a(), (ViewGroup) null);
                aatvVar.m = (ImageView) aatvVar.l.findViewById(R.id.background_image);
                aatvVar.n = (ImageView) aatvVar.l.findViewById(R.id.logo);
                adhv adhvVar = aatvVar.k;
                aatvVar.o = new adia(adhvVar, aatvVar.m, false);
                aatvVar.p = new adia(adhvVar, aatvVar.n, false);
                aatvVar.q = (TextView) aatvVar.l.findViewById(R.id.dialog_title);
                aatvVar.r = (TextView) aatvVar.l.findViewById(R.id.dialog_message);
                aatvVar.t = (TextView) aatvVar.l.findViewById(R.id.action_button);
                aatvVar.u = (TextView) aatvVar.l.findViewById(R.id.dismiss_button);
                aatvVar.s = aatvVar.i.setView(aatvVar.l).create();
                aatvVar.b(aatvVar.s);
                aatvVar.g(aratVar, xgnVar);
                aatvVar.f(aratVar, new yde(aatvVar, 4));
                aatvVar.s.show();
                aatv.e(aatvVar.j, aratVar);
            } else {
                aatv.e(this.b, aratVar);
            }
            if (xgnVar != null) {
                xgnVar.w(new xgj(aratVar.i, (amud) null), null);
                return;
            }
            return;
        }
        if (obj instanceof akmh) {
            aazo aazoVar = this.h;
            if (aazoVar == null) {
                aazo aazoVar2 = new aazo((Context) this.a, c());
                this.h = aazoVar2;
                aazoVar = aazoVar2;
            }
            akmh akmhVar = (akmh) obj;
            aduv aduvVar = this.f;
            if (pair != null) {
                ijf ijfVar = new ijf(aazoVar, pair, 7);
                AlertDialog alertDialog = (AlertDialog) aazoVar.b;
                alertDialog.setButton(-1, (CharSequence) pair.first, ijfVar);
                alertDialog.setButton(-2, ((Context) aazoVar.a).getResources().getText(R.string.dismiss), ijfVar);
            } else {
                ((AlertDialog) aazoVar.b).setButton(-2, ((Context) aazoVar.a).getResources().getText(R.string.dismiss), new xqu(aazoVar, 4));
            }
            if ((akmhVar.b & 1) != 0) {
                alja aljaVar = akmhVar.c;
                if (aljaVar == null) {
                    aljaVar = alja.a;
                }
                aliz alizVarA = aliz.a(aljaVar.c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                iA = aduvVar.a(alizVarA);
            }
            AlertDialog alertDialog2 = (AlertDialog) aazoVar.b;
            alertDialog2.setMessage(akmhVar.e);
            alertDialog2.setTitle(akmhVar.d);
            alertDialog2.setIcon(iA);
            alertDialog2.show();
            Window window = alertDialog2.getWindow();
            if (window != null) {
                Context context = (Context) aazoVar.a;
                if (txz.g(context)) {
                    window.setLayout(-2, -2);
                } else {
                    window.setLayout((int) context.getResources().getDimension(R.dimen.upsell_dialog_width), -2);
                }
            }
            if (xgnVar != null) {
                xgnVar.w(new xgj(akmhVar.h, (amud) null), null);
                return;
            }
            return;
        }
        if (obj instanceof akdd) {
            if (this.g == null) {
                this.g = new aatu(this.a, c(), this.b);
            }
            akdd akddVar = (akdd) obj;
            if (xgnVar != null) {
                xgnVar.w(new xgj(akddVar.m, (amud) null), null);
            } else {
                xgnVar = null;
            }
            aatu aatuVar = this.g;
            aatuVar.getClass();
            aatuVar.f = xgnVar;
            xqu xquVar = new xqu(aatuVar, 3);
            Context context2 = aatuVar.a;
            CharSequence text = context2.getResources().getText(R.string.ok);
            AlertDialog alertDialog3 = aatuVar.c;
            alertDialog3.setButton(-1, text, xquVar);
            alertDialog3.setButton(-2, context2.getResources().getText(R.string.cancel), xquVar);
            if ((akddVar.b & 1) != 0) {
                alayVar = akddVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            tuk.u(aatuVar.d, ackj.k(null, alayVar, null, false));
            TextView textView = aatuVar.e;
            if ((akddVar.b & 1073741824) != 0) {
                alayVar2 = akddVar.u;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            tuk.u(textView, ackj.k(null, alayVar2, null, false));
            alertDialog3.show();
            ajng ajngVar = akddVar.h;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            if ((ajngVar.b & 1) != 0) {
                ajng ajngVar2 = akddVar.h;
                if (ajngVar2 == null) {
                    ajngVar2 = ajng.a;
                }
                ajnfVar = ajngVar2.c;
                if (ajnfVar == null) {
                    ajnfVar = ajnf.a;
                }
            } else {
                ajnfVar = null;
            }
            ajng ajngVar3 = akddVar.g;
            if (((ajngVar3 == null ? ajng.a : ajngVar3).b & 1) != 0) {
                if (ajngVar3 == null) {
                    ajngVar3 = ajng.a;
                }
                ajnfVar2 = ajngVar3.c;
                if (ajnfVar2 == null) {
                    ajnfVar2 = ajnf.a;
                }
            } else {
                ajnfVar2 = null;
            }
            if (ajnfVar != null) {
                Button button = alertDialog3.getButton(-2);
                if ((ajnfVar.b & 64) != 0) {
                    alayVar4 = ajnfVar.m;
                    if (alayVar4 == null) {
                        alayVar4 = alay.a;
                    }
                } else {
                    alayVar4 = null;
                }
                button.setText(ackj.k(null, alayVar4, null, false));
                alertDialog3.getButton(-2).setTextColor(tzk.i(context2, R.attr.ytCallToAction));
                if (xgnVar != null) {
                    xgnVar.w(new xgj(ajnfVar.y, (amud) null), null);
                }
            } else if (ajnfVar2 != null) {
                alertDialog3.getButton(-2).setVisibility(8);
            }
            if (ajnfVar2 != null) {
                Button button2 = alertDialog3.getButton(-1);
                if ((ajnfVar2.b & 64) != 0) {
                    alayVar3 = ajnfVar2.m;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                } else {
                    alayVar3 = null;
                }
                button2.setText(ackj.k(null, alayVar3, null, false));
                alertDialog3.getButton(-1).setTextColor(tzk.i(context2, R.attr.ytCallToAction));
                if (xgnVar != null) {
                    xgnVar.w(new xgj(ajnfVar2.y, (amud) null), null);
                }
            } else {
                alertDialog3.getButton(-1).setVisibility(8);
            }
            aatuVar.h = ajnfVar;
            aatuVar.g = ajnfVar2;
        }
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        aatv aatvVar = this.d;
        if (aatvVar != null && aatvVar.s.isShowing()) {
            aatvVar.s.cancel();
        }
        aazo aazoVar = this.h;
        if (aazoVar != null) {
            aazoVar.d();
        }
    }
}
