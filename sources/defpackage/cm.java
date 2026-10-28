package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cm implements LayoutInflater.Factory2 {
    final dd a;

    public cm(dd ddVar) {
        this.a = ddVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        afjq afjqVarAp;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, au.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = cj.a;
                try {
                    if (cc.class.isAssignableFrom(cj.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.bY(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        cc ccVarF = resourceId != -1 ? this.a.f(resourceId) : null;
                        if (ccVarF == null && string != null) {
                            ccVarF = this.a.g(string);
                        }
                        if (ccVarF == null && id != -1) {
                            ccVarF = this.a.f(id);
                        }
                        if (ccVarF == null) {
                            dd ddVar = this.a;
                            cj cjVarJ = ddVar.j();
                            context.getClassLoader();
                            cc ccVarB = cjVarJ.b(attributeValue);
                            ccVarB.mFromLayout = true;
                            ccVarB.mFragmentId = resourceId != 0 ? resourceId : id;
                            ccVarB.mContainerId = id;
                            ccVarB.mTag = string;
                            ccVarB.mInLayout = true;
                            ccVarB.mFragmentManager = ddVar;
                            ccVarB.mHost = ddVar.p;
                            ccVarB.onInflate(ddVar.p.c, attributeSet, ccVarB.mSavedFragmentState);
                            afjqVarAp = ddVar.ao(ccVarB);
                            if (dd.aa(2)) {
                                Objects.toString(ccVarB);
                            }
                            ccVarF = ccVarB;
                        } else {
                            if (ccVarF.mInLayout) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            ccVarF.mInLayout = true;
                            dd ddVar2 = this.a;
                            ccVarF.mFragmentManager = ddVar2;
                            ccVarF.mHost = ddVar2.p;
                            ccVarF.onInflate(ddVar2.p.c, attributeSet, ccVarF.mSavedFragmentState);
                            afjqVarAp = ddVar2.ap(ccVarF);
                            if (dd.aa(2)) {
                                Objects.toString(ccVarF);
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i2 = bmy.a;
                        ccVarF.getClass();
                        bmz bmzVar = new bmz(ccVarF, viewGroup);
                        bmy.d(bmzVar);
                        bmx bmxVarB = bmy.b(ccVarF);
                        if (bmxVarB.b.contains(bmw.d) && bmy.e(bmxVarB, ccVarF.getClass(), bmzVar.getClass())) {
                            bmy.c(bmxVarB, bmzVar);
                        }
                        ccVarF.mContainer = viewGroup;
                        afjqVarAp.i();
                        afjqVarAp.h();
                        View view2 = ccVarF.mView;
                        if (view2 == null) {
                            throw new IllegalStateException(a.bT(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (ccVarF.mView.getTag() == null) {
                            ccVarF.mView.setTag(string);
                        }
                        ccVarF.mView.addOnAttachStateChangeListener(new cl(this, afjqVarAp));
                        return ccVarF.mView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
