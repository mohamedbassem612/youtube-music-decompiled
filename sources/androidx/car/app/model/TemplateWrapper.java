package androidx.car.app.model;

import defpackage.aad;
import defpackage.acz;
import defpackage.yf;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private acz mTemplate;
    private List mTemplateInfoForScreenStack;

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }

    public static TemplateWrapper copyOf(TemplateWrapper templateWrapper) {
        TemplateWrapper templateWrapperWrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            templateWrapperWrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return templateWrapperWrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    public static TemplateWrapper wrap(acz aczVar, String str) {
        aczVar.getClass();
        str.getClass();
        return new TemplateWrapper(aczVar, str);
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        String str = this.mId;
        str.getClass();
        return str;
    }

    public acz getTemplate() {
        acz aczVar = this.mTemplate;
        aczVar.getClass();
        return aczVar;
    }

    public List getTemplateInfosForScreenStack() {
        return aad.a(this.mTemplateInfoForScreenStack);
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(acz aczVar) {
        this.mTemplate = aczVar;
    }

    public void setTemplateInfosForScreenStack(List list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        return "[template: " + this.mTemplate + ", ID: " + this.mId + ']';
    }

    public static TemplateWrapper wrap(acz aczVar) {
        return wrap(aczVar, createRandomId());
    }

    private TemplateWrapper(acz aczVar, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = aczVar;
        this.mId = str;
    }
}
