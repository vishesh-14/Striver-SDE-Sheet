// Better Approch 
Node *flatten(Node *root)
{
   // Your code here
  // Time Complexity :o(nlogm)
  // Space Complexity : o(n)
   priority_queue<pair<int,Node*>,vector<pair<int,Node *>>,greater<pair<int,Node *>>> pq;
    for(Node *temp=root;temp!=NULL;temp=temp->next)
    {
         pq.push({temp->data,temp});
    }
    Node* dummy=new Node(-1);
    Node*prev=dummy;
     while(!pq.empty())
     {
         pair<int,Node*> top=pq.top();
      
         pq.pop();
          Node* curr=top.second;
          prev->bottom=curr;
          prev=curr;
         if(curr->bottom!=NULL)
           pq.push({curr->bottom->data,curr->bottom});
     }
     
    return dummy->bottom;
}
//--------------------------Efficient Approach---------------//
//--------------------------Refer striver  video -----------// 
