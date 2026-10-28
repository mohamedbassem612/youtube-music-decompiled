package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aefn implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aefn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$cid) {
            case 0:
                ((aefs) this.a).b(0);
                break;
            case 1:
                aeej aeejVar = (aeej) this.a;
                aeejVar.h(aeejVar.c.indexOf(view));
                break;
            case 2:
                ((vrm) ((xxj) this.a).a).p();
                break;
            case 3:
                aeja aejaVar = ((aeiz) this.a).a;
                if (aejaVar != null) {
                    aejaVar.a();
                }
                break;
            case 4:
                ((aeke) this.a).m();
                break;
            case 5:
                ((aeke) this.a).n();
                break;
            case 6:
                ((addn) this.a).d();
                break;
            case 7:
                for (aekx aekxVar : ((aekq) this.a).a) {
                }
                break;
            case 8:
                ((CompoundButton) ((xta) this.a).d).toggle();
                break;
            case 9:
                aevw aevwVar = (aevw) this.a;
                if (aevwVar.d && aevwVar.isShowing()) {
                    if (!aevwVar.f) {
                        TypedArray typedArrayObtainStyledAttributes = aevwVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        aevwVar.e = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        aevwVar.f = true;
                    }
                    if (aevwVar.e) {
                        aevwVar.cancel();
                    }
                    break;
                }
                break;
            case 10:
                Object obj = this.a;
                afdt afdtVar = (afdt) obj;
                EditText editText = afdtVar.a;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (view.hasFocus()) {
                        afdtVar.a.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    ((afeg) obj).x();
                }
                break;
            case 11:
                ((afeb) this.a).m();
                break;
            default:
                Object obj2 = this.a;
                afem afemVar = (afem) obj2;
                EditText editText2 = afemVar.a;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    if (afemVar.k()) {
                        afemVar.a.setTransformationMethod(null);
                    } else {
                        afemVar.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        afemVar.a.setSelection(selectionEnd);
                    }
                    ((afeg) obj2).x();
                    break;
                }
                break;
        }
    }

    public aefn(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
