package app.rive.runtime.kotlin.core;

import android.graphics.RectF;
import app.rive.runtime.kotlin.core.errors.AnimationException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import defpackage.a;
import defpackage.atqq;
import defpackage.awns;
import defpackage.awqx;
import defpackage.awro;
import defpackage.awrz;
import defpackage.awsa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class Artboard extends NativeObject {
    public static final int $stable = 8;
    private final File file;
    private final ReentrantLock fileLock;
    private ViewModelInstance viewModelInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Artboard(long j, ReentrantLock reentrantLock, File file) {
        super(j);
        reentrantLock.getClass();
        this.fileLock = reentrantLock;
        this.file = file;
    }

    private final SMIInput convertInput(SMIInput sMIInput) throws StateMachineInputException {
        if (sMIInput.isBoolean()) {
            return new SMIBoolean(sMIInput.getCppPointer(), this.fileLock);
        }
        if (sMIInput.isTrigger()) {
            return new SMITrigger(sMIInput.getCppPointer(), this.fileLock);
        }
        if (sMIInput.isNumber()) {
            return new SMINumber(sMIInput.getCppPointer(), this.fileLock);
        }
        throw new StateMachineInputException("Unknown State Machine Input Instance for " + sMIInput.getName() + '.');
    }

    private final native boolean cppAdvance(long j, float f);

    private final native long cppAnimationByIndex(long j, int i);

    private final native long cppAnimationByName(long j, String str);

    private final native int cppAnimationCount(long j);

    private final native String cppAnimationNameByIndex(long j, int i);

    private final native RectF cppBounds(long j);

    private final native void cppDraw(long j, long j2);

    private final native long cppFindTextValueRun(long j, String str);

    private final native long cppFindTextValueRunAtPath(long j, String str, String str2);

    private final native String cppFindValueOfTextValueRun(long j, String str);

    private final native String cppFindValueOfTextValueRunAtPath(long j, String str, String str2);

    private final native float cppGetArtboardHeight(long j);

    private final native float cppGetArtboardWidth(long j);

    private final native float cppGetVolume(long j);

    private final native long cppInputByNameAtPath(long j, String str, String str2);

    private final native String cppName(long j);

    private final native void cppResetArtboardSize(long j);

    private final native void cppSetArtboardHeight(long j, float f);

    private final native void cppSetArtboardWidth(long j, float f);

    private final native boolean cppSetValueOfTextValueRun(long j, String str, String str2);

    private final native boolean cppSetValueOfTextValueRunAtPath(long j, String str, String str2, String str3);

    private final native void cppSetViewModelInstance(long j, long j2);

    private final native void cppSetVolume(long j, float f);

    private final native long cppStateMachineByIndex(long j, int i);

    private final native long cppStateMachineByName(long j, String str);

    private final native int cppStateMachineCount(long j);

    private final native String cppStateMachineNameByIndex(long j, int i);

    public static /* synthetic */ void draw$default(Artboard artboard, long j, Fit fit, Alignment alignment, float f, int i, Object obj) {
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        artboard.draw(j, fit, alignment, f);
    }

    public final boolean advance(float f) {
        boolean zCppAdvance;
        synchronized (this.fileLock) {
            zCppAdvance = cppAdvance(getCppPointer(), f);
        }
        return zCppAdvance;
    }

    public final LinearAnimationInstance animation(String str) throws AnimationException {
        str.getClass();
        long jCppAnimationByName = cppAnimationByName(getCppPointer(), str);
        if (jCppAnimationByName != 0) {
            LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByName, this.fileLock, 0.0f, 4, null);
            getDependencies().add(linearAnimationInstance);
            return linearAnimationInstance;
        }
        List animationNames = getAnimationNames();
        ArrayList arrayList = new ArrayList(atqq.N(animationNames, 10));
        Iterator it = animationNames.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + '\"');
        }
        throw new AnimationException("Animation \"" + str + "\" not found. Available Animations: " + arrayList + '\"');
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j);

    protected final native void cppDrawAligned(long j, long j2, Fit fit, Alignment alignment, float f);

    public final void draw(long j, Fit fit, Alignment alignment, float f) {
        fit.getClass();
        alignment.getClass();
        synchronized (this.fileLock) {
            if (getHasCppObject()) {
                cppDrawAligned(getCppPointer(), j, fit, alignment, f);
            }
        }
    }

    public final int getAnimationCount() {
        return cppAnimationCount(getCppPointer());
    }

    public final List getAnimationNames() {
        awsa awsaVarL = awro.l(0, getAnimationCount());
        ArrayList arrayList = new ArrayList(atqq.N(awsaVarL, 10));
        awns it = awsaVarL.iterator();
        while (((awrz) it).a) {
            arrayList.add(cppAnimationNameByIndex(getCppPointer(), it.a()));
        }
        return arrayList;
    }

    public final RectF getBounds() {
        return cppBounds(getCppPointer());
    }

    public final File getFile$third_party_java_android_libs_rive_rive_android() {
        return this.file;
    }

    public final LinearAnimationInstance getFirstAnimation() {
        return animation(0);
    }

    public final StateMachineInstance getFirstStateMachine() {
        return stateMachine(0);
    }

    public final float getHeight() {
        return cppGetArtboardHeight(getCppPointer());
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final int getStateMachineCount() {
        return cppStateMachineCount(getCppPointer());
    }

    public final List getStateMachineNames() {
        awsa awsaVarL = awro.l(0, getStateMachineCount());
        ArrayList arrayList = new ArrayList(atqq.N(awsaVarL, 10));
        awns it = awsaVarL.iterator();
        while (((awrz) it).a) {
            arrayList.add(cppStateMachineNameByIndex(getCppPointer(), it.a()));
        }
        return arrayList;
    }

    public final String getTextRunValue(String str, String str2) {
        str.getClass();
        str2.getClass();
        return cppFindValueOfTextValueRunAtPath(getCppPointer(), str, str2);
    }

    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public final float getVolume() {
        return cppGetVolume(getCppPointer());
    }

    public final float getWidth() {
        return cppGetArtboardWidth(getCppPointer());
    }

    public final SMIInput input(String str, String str2) {
        SMIInput sMIInputConvertInput;
        str.getClass();
        str2.getClass();
        synchronized (this.fileLock) {
            long jCppInputByNameAtPath = cppInputByNameAtPath(getCppPointer(), str, str2);
            if (jCppInputByNameAtPath == 0) {
                throw new StateMachineInputException("No StateMachineInput found with name \"" + str + "\" in nested artboard " + str2 + '.');
            }
            sMIInputConvertInput = convertInput(new SMIInput(jCppInputByNameAtPath, this.fileLock));
        }
        return sMIInputConvertInput;
    }

    public final ViewModelInstance receiveViewModelInstance(ViewModelInstance.Transfer transfer) {
        transfer.getClass();
        ViewModelInstance viewModelInstanceEnd$third_party_java_android_libs_rive_rive_android = transfer.end$third_party_java_android_libs_rive_rive_android();
        getDependencies().add(viewModelInstanceEnd$third_party_java_android_libs_rive_rive_android);
        setViewModelInstance(viewModelInstanceEnd$third_party_java_android_libs_rive_rive_android);
        return viewModelInstanceEnd$third_party_java_android_libs_rive_rive_android;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease;
        synchronized (this.fileLock) {
            iRelease = super.release();
        }
        return iRelease;
    }

    public final void resetArtboardSize() {
        synchronized (this.fileLock) {
            cppResetArtboardSize(getCppPointer());
        }
    }

    public final void setHeight(float f) {
        synchronized (this.fileLock) {
            cppSetArtboardHeight(getCppPointer(), f);
        }
    }

    public final void setTextRunValue(String str, String str2, String str3) throws TextValueRunException {
        boolean zCppSetValueOfTextValueRunAtPath;
        str.getClass();
        str2.getClass();
        str3.getClass();
        synchronized (this.fileLock) {
            zCppSetValueOfTextValueRunAtPath = cppSetValueOfTextValueRunAtPath(getCppPointer(), str, str2, str3);
        }
        if (!zCppSetValueOfTextValueRunAtPath) {
            throw new TextValueRunException(a.ct(str3, str, "Could not set text run value at path. No Rive TextValueRun found with name \"", ".\" in nested artboard \"", ".\""));
        }
    }

    public final void setViewModelInstance(ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            viewModelInstance.updateFileLock$third_party_java_android_libs_rive_rive_android(this.fileLock);
            synchronized (this.fileLock) {
                cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
                this.viewModelInstance = viewModelInstance;
            }
        }
    }

    public final void setVolume$third_party_java_android_libs_rive_rive_android(float f) {
        synchronized (this.fileLock) {
            cppSetVolume(getCppPointer(), f);
        }
    }

    public final void setWidth(float f) {
        synchronized (this.fileLock) {
            cppSetArtboardWidth(getCppPointer(), f);
        }
    }

    public final StateMachineInstance stateMachine(String str) throws StateMachineException {
        str.getClass();
        long jCppStateMachineByName = cppStateMachineByName(getCppPointer(), str);
        if (jCppStateMachineByName == 0) {
            throw new StateMachineException(a.bU((byte) 46, str, "No StateMachine found with name "));
        }
        StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByName, this.fileLock);
        getDependencies().add(stateMachineInstance);
        return stateMachineInstance;
    }

    public final RiveTextValueRun textRun(String str, String str2) throws TextValueRunException {
        str.getClass();
        str2.getClass();
        long jCppFindTextValueRunAtPath = cppFindTextValueRunAtPath(getCppPointer(), str, str2);
        if (jCppFindTextValueRunAtPath == 0) {
            throw new TextValueRunException(a.ca(str2, str, "No Rive TextValueRun found with name \"", ".\" in nested artboard "));
        }
        RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRunAtPath, this.fileLock);
        getDependencies().add(riveTextValueRun);
        return riveTextValueRun;
    }

    public /* synthetic */ Artboard(long j, ReentrantLock reentrantLock, File file, int i, awqx awqxVar) {
        this(j, reentrantLock, (i & 4) != 0 ? null : file);
    }

    public final String getTextRunValue(String str) {
        str.getClass();
        return cppFindValueOfTextValueRun(getCppPointer(), str);
    }

    public static /* synthetic */ void getAnimationCount$annotations() {
    }

    public static /* synthetic */ void getAnimationNames$annotations() {
    }

    public static /* synthetic */ void getFirstAnimation$annotations() {
    }

    public static /* synthetic */ void getStateMachineCount$annotations() {
    }

    public static /* synthetic */ void getStateMachineNames$annotations() {
    }

    public final void draw(long j) {
        synchronized (this.fileLock) {
            if (getHasCppObject()) {
                cppDraw(getCppPointer(), j);
            }
        }
    }

    public final StateMachineInstance stateMachine(int i) throws StateMachineException {
        long jCppStateMachineByIndex = cppStateMachineByIndex(getCppPointer(), i);
        if (jCppStateMachineByIndex != 0) {
            StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByIndex, this.fileLock);
            getDependencies().add(stateMachineInstance);
            return stateMachineInstance;
        }
        throw new StateMachineException(a.ci((byte) 46, i, "No StateMachine found at index "));
    }

    public final void setTextRunValue(String str, String str2) throws TextValueRunException {
        boolean zCppSetValueOfTextValueRun;
        str.getClass();
        str2.getClass();
        synchronized (this.fileLock) {
            zCppSetValueOfTextValueRun = cppSetValueOfTextValueRun(getCppPointer(), str, str2);
        }
        if (!zCppSetValueOfTextValueRun) {
            throw new TextValueRunException(a.bT(str, "Could not set text run. No Rive TextValueRun found with name \"", ".\""));
        }
    }

    public final RiveTextValueRun textRun(String str) throws TextValueRunException {
        str.getClass();
        long jCppFindTextValueRun = cppFindTextValueRun(getCppPointer(), str);
        if (jCppFindTextValueRun != 0) {
            RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRun, this.fileLock);
            getDependencies().add(riveTextValueRun);
            return riveTextValueRun;
        }
        throw new TextValueRunException(a.bT(str, "No Rive TextValueRun found with name \"", ".\""));
    }

    public final LinearAnimationInstance animation(int i) throws AnimationException {
        long jCppAnimationByIndex = cppAnimationByIndex(getCppPointer(), i);
        if (jCppAnimationByIndex != 0) {
            LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByIndex, this.fileLock, 0.0f, 4, null);
            getDependencies().add(linearAnimationInstance);
            return linearAnimationInstance;
        }
        throw new AnimationException(a.ci((byte) 46, i, "No Animation found at index "));
    }
}
