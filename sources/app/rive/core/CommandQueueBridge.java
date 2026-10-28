package app.rive.core;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface CommandQueueBridge {
    void cppAdvanceStateMachine(long j, long j2, long j3, long j4);

    void cppAppendToList(long j, long j2, String str, long j3);

    void cppBind(long j, long j2, long j3);

    void cppCancelDraw(long j, long j2);

    void cppClearFocus(long j, long j2, long j3);

    void cppClearGlobalViewModelInstance(long j, long j2, long j3, String str);

    void cppClearMainViewModelInstance(long j, long j2, long j3);

    void cppClearSemanticFocus(long j, long j2);

    long cppConstructor(long j);

    long cppCreateArtboardByName(long j, long j2, long j3, String str);

    long cppCreateDefaultArtboard(long j, long j2, long j3);

    long cppCreateDefaultStateMachine(long j, long j2, long j3);

    long cppCreateDrawKey(long j);

    Listeners cppCreateListeners(long j, CommandQueue commandQueue);

    long cppCreateStateMachineByName(long j, long j2, long j3, String str);

    long cppDecodeAudio(long j, long j2, byte[] bArr);

    long cppDecodeFont(long j, long j2, byte[] bArr);

    long cppDecodeImage(long j, long j2, byte[] bArr);

    long cppDefaultVMCreateBlankVMI(long j, long j2, long j3, long j4);

    long cppDefaultVMCreateDefaultVMI(long j, long j2, long j3, long j4);

    long cppDefaultVMCreateNamedVMI(long j, long j2, long j3, long j4, String str);

    void cppDelete(long j);

    void cppDeleteArtboard(long j, long j2, long j3);

    void cppDeleteAudio(long j, long j2);

    void cppDeleteFile(long j, long j2, long j3);

    void cppDeleteFont(long j, long j2);

    void cppDeleteImage(long j, long j2);

    void cppDeleteStateMachine(long j, long j2, long j3);

    void cppDeleteViewModelInstance(long j, long j2, long j3);

    void cppDrainSemanticsDiff(long j, long j2, byte b, byte b2, float f, float f2, float f3);

    void cppDraw(long j, long j2, long j3, long j4, long j5, long j6, int i, int i2, byte b, byte b2, float f, int i3);

    void cppDrawToBuffer(long j, long j2, long j3, long j4, long j5, long j6, int i, int i2, byte b, byte b2, float f, int i3, byte[] bArr);

    void cppEnableSemantics(long j, long j2);

    void cppFireSemanticAction(long j, long j2, int i, int i2);

    void cppFireTriggerProperty(long j, long j2, String str);

    void cppFocusNext(long j, long j2, long j3);

    void cppFocusPrevious(long j, long j2, long j3);

    void cppGetArtboardNames(long j, long j2, long j3);

    void cppGetArtboardVolume(long j, long j2, long j3);

    void cppGetBooleanProperty(long j, long j2, long j3, String str);

    void cppGetColorProperty(long j, long j2, long j3, String str);

    void cppGetDefaultViewModelInfo(long j, long j2, long j3, long j4);

    void cppGetEnumProperty(long j, long j2, long j3, String str);

    void cppGetEnums(long j, long j2, long j3);

    void cppGetFileAssets(long j, long j2, long j3);

    void cppGetListSize(long j, long j2, long j3, String str);

    void cppGetNumberProperty(long j, long j2, long j3, String str);

    void cppGetStateMachineNames(long j, long j2, long j3);

    void cppGetStringProperty(long j, long j2, long j3, String str);

    void cppGetViewModelInstanceName(long j, long j2, long j3);

    void cppGetViewModelInstanceNames(long j, long j2, long j3, String str);

    void cppGetViewModelInstanceViewModelName(long j, long j2, long j3);

    void cppGetViewModelNames(long j, long j2, long j3);

    void cppGetViewModelProperties(long j, long j2, long j3, String str);

    void cppInsertToListAtIndex(long j, long j2, String str, int i, long j3);

    long cppLoadFile(long j, long j2, byte[] bArr);

    long cppNamedVMCreateBlankVMI(long j, long j2, long j3, String str);

    long cppNamedVMCreateDefaultVMI(long j, long j2, long j3, String str);

    long cppNamedVMCreateNamedVMI(long j, long j2, long j3, String str, String str2);

    void cppPointerDown(long j, long j2, byte b, byte b2, float f, float f2, float f3, int i, float f4, float f5);

    void cppPointerExit(long j, long j2, byte b, byte b2, float f, float f2, float f3, int i, float f4, float f5);

    void cppPointerMove(long j, long j2, byte b, byte b2, float f, float f2, float f3, int i, float f4, float f5);

    void cppPointerUp(long j, long j2, byte b, byte b2, float f, float f2, float f3, int i, float f4, float f5);

    void cppPollMessages(long j);

    long cppReferenceListItemVMI(long j, long j2, long j3, String str, int i);

    long cppReferenceNestedVMI(long j, long j2, long j3, String str);

    void cppRegisterAudio(long j, String str, long j2);

    void cppRegisterFont(long j, String str, long j2);

    void cppRegisterImage(long j, String str, long j2);

    void cppRemoveFromList(long j, long j2, String str, long j3);

    void cppRemoveFromListAtIndex(long j, long j2, String str, int i);

    void cppRequestFocusState(long j, long j2, long j3);

    void cppRequestHasFocusNodes(long j, long j2, long j3);

    void cppRequestSemanticFocus(long j, long j2, int i);

    void cppResetArtboardSize(long j, long j2);

    void cppResizeArtboard(long j, long j2, int i, int i2, float f);

    void cppRunOnCommandServer(long j, Function0 function0);

    void cppSetArtboardProperty(long j, long j2, String str, long j3);

    void cppSetArtboardVolume(long j, long j2, long j3, float f);

    void cppSetBooleanProperty(long j, long j2, String str, boolean z);

    void cppSetColorProperty(long j, long j2, String str, int i);

    void cppSetDeferredEnabled(long j, boolean z);

    void cppSetEnumProperty(long j, long j2, String str, String str2);

    void cppSetFontProperty(long j, long j2, String str, long j3);

    void cppSetGlobalViewModelInstance(long j, long j2, long j3, String str, long j4);

    void cppSetImageProperty(long j, long j2, String str, long j3);

    void cppSetMainViewModelInstance(long j, long j2, long j3, long j4);

    void cppSetNumberProperty(long j, long j2, String str, float f);

    void cppSetStringProperty(long j, long j2, String str, String str2);

    void cppSetTracingEnabled(long j, boolean z);

    void cppSetViewModelInstanceProperty(long j, long j2, String str, long j3);

    void cppSubscribeToProperty(long j, long j2, String str, int i);

    void cppSwapListItems(long j, long j2, String str, int i, int i2);

    void cppUnregisterAudio(long j, String str);

    void cppUnregisterFont(long j, String str);

    void cppUnregisterImage(long j, String str);

    void cppUnsubscribeFromProperty(long j, long j2, String str, int i);

    boolean isCurrentThreadCommandServer(long j);
}
