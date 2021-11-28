from django.shortcuts import render
from .models import Student
from .serializers import StudentSerializer
from django.http import JsonResponse

# Create your views here.

def students_json(request):
    students = Student.objects.all()
    serializer = StudentSerializer(students, many=True)
    return JsonResponse(serializer.data, safe=False, status=200)