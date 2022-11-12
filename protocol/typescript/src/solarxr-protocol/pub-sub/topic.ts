// automatically generated by the FlatBuffers compiler, do not modify

import { TopicHandle, TopicHandleT } from '../../solarxr-protocol/pub-sub/topic-handle';
import { TopicId, TopicIdT } from '../../solarxr-protocol/pub-sub/topic-id';


export enum Topic{
  NONE = 0,
  TopicHandle = 1,
  TopicId = 2
}

export function unionToTopic(
  type: Topic,
  accessor: (obj:TopicHandle|TopicId) => TopicHandle|TopicId|null
): TopicHandle|TopicId|null {
  switch(Topic[type]) {
    case 'NONE': return null; 
    case 'TopicHandle': return accessor(new TopicHandle())! as TopicHandle;
    case 'TopicId': return accessor(new TopicId())! as TopicId;
    default: return null;
  }
}

export function unionListToTopic(
  type: Topic, 
  accessor: (index: number, obj:TopicHandle|TopicId) => TopicHandle|TopicId|null, 
  index: number
): TopicHandle|TopicId|null {
  switch(Topic[type]) {
    case 'NONE': return null; 
    case 'TopicHandle': return accessor(index, new TopicHandle())! as TopicHandle;
    case 'TopicId': return accessor(index, new TopicId())! as TopicId;
    default: return null;
  }
}

